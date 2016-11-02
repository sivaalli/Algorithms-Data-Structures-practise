package BinarySearchTree;
import java.util.*;

import java.awt.Checkbox;

public class BinarySearchTree {
	//create a static root and initialize when object initialized using constructor;
	public static Node root;
	public BinarySearchTree(){
		root=null;
	}
//==========================INSERT=====================================================
	public void insert(int data){
		Node newNode=new Node(data);
		Node current=root;
		Node parent=null;;
		while(current!=null){
			//System.out.println("Inserting");
			parent=current;
			
			if(data<current.data){
				//System.out.println("hi");
				current=current.left;
				if(current==null){		
					parent.left=newNode;
					System.out.println("inserting to left node of "+parent.data);
				}
			}
			else{
				//System.out.println(current.data);
				current=current.right;
				if(current==null){
					parent.right=newNode;
					System.out.println("inserting to right node of "+parent.data);
				}
			}
		}
		if(root==null){
			System.out.println("creating root node");
			root=newNode;
		}
		
	}
//===============================IN ORDER TRAVERSAL=======================================
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
	}
//==============================CHECK IF 2 TREES ARE EQUAL=================================
	public boolean checkTreesAreEqual(Node root1, Node root2){
		if(root1!=null&&root2!=null){
			if(root1.data==root2.data){
				System.out.println(root1.data);
				System.out.println("calling on left");
				checkTreesAreEqual(root1.left, root2.left);
				System.out.println("calling on right");
				checkTreesAreEqual(root1.right, root2.right);
			}
			else
				return false;
		}	
		return true;
	}
//===========================PRINT ALL LEAF NODES==============================================
	public void boundaryTraversal(Node root){
		if(root!=null){
			if(root.left==null&&root.right==null){
				System.out.print(root.data+"  ");
			}
			else{
				boundaryTraversal(root.left);
				boundaryTraversal(root.right);
			}
					
		}
	}
	
//=============================PRINT SIZE OF TREE===========================================
	public int size(Node root){
		if(root==null){
			return 0;
		}
		else{
			return 1+size(root.left)+size(root.right);
		}
	}
	
//===========================RETURNS MAX OF 2 ELEMENTS======================================
	public static int max(int a,int b){
		return (a>b)? a:b;	
	}
//============================return height of binary tree==================================
	public int height(int h,Node root){
		if(root!=null){
			return max(height(h+1,root.left),height(h+1,root.right));
			
	}
		else return h-1;
	}
	
//==============================function to return height====================================
	public int height1(Node root){
		if(root==null){
			return 0;
		}
		return 1+max(height1(root.left),height1(root.right));
	}
	
//==============================check if tree is a binary tree===============================
	public boolean isBinaryTree(Node root){
		if(root!=null){
			if(root.left==null&&root.right==null){
				return true;
			}else{
				if(root.left==null&&root.data<root.right.data){
					isBinaryTree(root.right);
				}
				else if(root.right==null&&root.data>root.left.data){
					isBinaryTree(root.left);
				}
				else if(root.data>root.left.data&&root.right.data>root.data){
					return isBinaryTree(root.left)&&isBinaryTree(root.right);
				}else return false;
			}
		}
		return true;
	}
//============================level order traversal===========================================
//https://www.youtube.com/watch?v=9PHkM0Jri_4&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu&index=9
	public void leverOrderTraversal(Node root){
		if(root!=null){
			Queue<Node> q=new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty()){
				root=q.poll();
				System.out.print(root.data+"  ");
				if(root.left!=null){
					q.add(root.left);
				}if(root.right!=null){
					q.add(root.right);
				}
				
			}
		}
	}
	
	/*public void leftView(Node root){
		int height=-1;
		while(root!=null){
			height=height+1;
			System.out.println(root.data);
			root=root.left;	
		}
		root=BinarySearchTree.root;
		while(root!=null){
			
		}
		
	}*/
	
//========================delete all node with only one child============================
	public Node deleteOneChild(Node root){
		if(root!=null){
			if(root.left==null&&root.right!=null){
				System.out.println("deleted"+root.data);
				//root=null;
				return null;
			
			}
			else if(root.left!=null&&root.right==null){
				System.out.println("deleted"+root.data);
				//root=null;
				return null;
				
			}else if(root.left!=null&&root.right!=null){
				root.left=deleteOneChild(root.left);
				root.right=deleteOneChild(root.right);	
			}
		}
		return root;
	}
//=====================================IS SUM TREE=============================================
	public boolean sumTree(Node root,int sum){
		if(root!=null){
			if(root.left==null&&root.right==null){
				System.out.println("leaf root.data is+"+root.data+"sum="+sum);
				if(sum-root.data==0){
					System.out.println(sum+"and the node is "+root.data);
					return true;
				}
			}else{
				return sumTree(root.left,sum-root.data)||sumTree(root.right,sum-root.data);
			}
		}
		return false;
	}
//======================================SEARCH ELEMENT=======================================
	public Node find(int data,Node root){
		if(root==null){
			return null;
		}
		while(root.data!=data){
			if(data<root.data){
				//go left
				root=root.left;
			}else{
				root=root.right;
			}
		}
		return root;
	}
//===================================mirror tree for any given root==============================
	public Node mirrorTree(Node root){
		if(root!=null){
			if(root.left!=null || root.right!=null){
				Node dummy=null;
				dummy=root.left;
				root.left=root.right;
				root.right=dummy;
				mirrorTree(root.left);
				mirrorTree(root.right);
			}
		}
		return root;
	}

//=============================ITERATIVE POST ORDER USING 2 STACKS===========================================
//=========================POST ORDER= LEFT,RIGHT,MIDDLE================================	
	public void iterativePostOrder(Node root){
		if(root==null){
			return;
		}
		Stack<Node> s1=new Stack<>();
		Stack<Node> s2=new Stack<>();
		s1.push(root);
		while(!s1.isEmpty()){
			root=s1.pop();
			s2.push(root);
			if(root.left!=null){
				s1.push(root.left);
			}
			if(root.right!=null){
				s1.push(root.right);
			}
		}
		while(!s2.isEmpty()){
			root=s2.pop();
			System.out.print(root.data+" ");
		}
	}
//=================================ITERATIVE PRE ORDER=============================
//=================================PRINT NODE,VISIT LEFT,VISIT RIGHT===================
	public void iterativePreOrderTraversal(Node root){
		if(root==null){
			return;
		}
		Stack<Node> s = new Stack<>();
	
		s.push(root);
		while(!s.isEmpty()){
			root=s.pop();
			System.out.print(root.data+" ");
			if(root.right!=null){
				s.push(root.right);
			}
			if(root.left!=null){
				s.push(root.left);
			}
		}
	}
//=================================ITERATIVE INORDER TRAVERSAL=============================
	public void iterativeInOrderTraversal(Node root){
		if(root==null){
			return;
		}
		Stack<Node> s= new Stack<>();
		while(true){
			if(root!=null){
				s.push(root);
				root=root.left;
			}else{
				if(s.empty()){break;}
				root=s.pop();
				System.out.print(root.data+" ");
				root=root.right;
			}
		}
	}
//=================================SUCCESSOR OF GIVEN NODE================================
//https://www.youtube.com/watch?v=5cPbNCrdotA
	public Node successor(Node root,int data){
		if(root==null){
			return null;
		}
		//find then Node with the data first using find()
		Node current=find(data, root);
		if(current==null){return null;}
		//case 1. if current has right sub tree,then successor is deepest left leaf of right of root
		if(current.right!=null){
			current=current.right;
			while(current.left!=null){
				
				current=current.left;
			}
			return current;
		}
		
		//case 2. if current has no right.then find the immediate ancestor for which current is to right
		else{
			Node successor=null;
			Node ancestor=root;
			while(ancestor.data!=current.data){
				if(current.data<ancestor.data){
					successor=ancestor;
					ancestor=ancestor.left;
				}else{
					ancestor=ancestor.right;
				}
			}
			return successor;
		}
	}
		
		
//===========================LOWEST COMON ANCESTOR====================================
		public Node lowestCommonAncestorBST(Node root,int n1,int n2){
			Node ancestor=root;
			while(true){
				if(n1>ancestor.data&&n2>ancestor.data){
					ancestor=ancestor.right;
				}
				else if(n1<ancestor.data&&n2<ancestor.data){
					ancestor=ancestor.left;
				}
				else{break;}
				}
			return ancestor;
			}
		
		
//===========================================MAIN PROGRAM=========================================
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree b =new BinarySearchTree();
		
		System.out.println("inserting 23");
		b.insert(23);
		System.out.println("inserting 24");
		b.insert(24);
		System.out.println("inserting 28");
		b.insert(28);
		System.out.println("inserting 19");
		b.insert(19);
		System.out.println("inserting 1");
		b.insert(1);
		System.out.println("inserting 21");
		b.insert(21);
		b.insert(29);
		b.insert(30);
		b.insert(31);
		b.insert(32);
		b.insert(20);
		b.display(root);
		System.out.println();
		//Node mirror=b.mirrorTree(root);
		//System.out.println("-------------mirror tree--------------");
		//b.display(mirror);
		/*
		 * boolean flag=b.checkTreesAreEqual(root,root);
		if(flag){
			System.out.println("trees are =");
		}
		else
			System.out.println("trees are not =");
		 */
		//System.out.println("=================================");
		///b.boundaryTraversal(root);
		//System.out.println(b.size(root));
		//System.out.println(b.height(0,root));
		//System.out.println(b.height1(root));
		//samle root1
		/*	Node root1=new Node(20);
			root1.left=new Node(21);
			root1.right=new Node(43);
			root1.left.left=new Node(50);
		if(b.sumTree(root, 45)){
			System.out.println("tree has a sum");
		}
		else
			System.out.println("tree has no sum");
		if(b.isBinaryTree(root1)){
			System.out.println("the tree is a binary tree");
		}else System.out.println("not a binary tree");*/
		
		//b.leverOrderTraversal(root);
		//System.out.println("----------");
		//Node nodeWithNoOneChild=b.deleteOneChild(root);
		//b.display(nodeWithNoOneChild);

		//b.iterativePostOrder(root);
		//System.out.println();
		//b.iterativePreOrderTraversal(root);
		//System.out.println();
		//Node succ=b.successor(root, 20);
		//System.out.println(succ.data);
		Node ancestor=b.lowestCommonAncestorBST(root, 20, 21);
		System.out.println(ancestor.data);
		
	}}



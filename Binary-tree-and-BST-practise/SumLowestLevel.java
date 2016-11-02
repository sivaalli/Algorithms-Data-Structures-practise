package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class SumLowestLevel {
	private Node root;
	SumLowestLevel(int data){
		root=new Node(data);
	}
	public int sumLowLevel(Node root){
		int sum=0;
		Queue<Node> queue=new LinkedList<>();
		if(root==null){
			return -1;
		}else{
			queue.add(root);
			queue.add(null);
		}
		while(!queue.isEmpty()&&queue.size()>1){
			root=queue.poll();
			if(root==null){
				if(sum!=0){
					break;
				}
				//System.out.println("added null");
				queue.add(null);
				
			}else{
			
				//System.out.println(root.data);
				if(root.left==null && root.right==null){
					sum=sum+root.data;
				}else{
					if(root.left!=null){
						queue.add(root.left);
						//System.out.println("added to queue left"+root.left.data);
					}
					if(root.right!=null){
						queue.add(root.right);
						//System.out.println("added to queue right"+root.right.data);
					}
				}	
			}
			
		}
		return sum;
	}
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
					//System.out.println("inserting to left node of "+parent.data);
				}
			}
			else{
				//System.out.println(current.data);
				current=current.right;
				if(current==null){
					parent.right=newNode;
					//System.out.println("inserting to right node of "+parent.data);
				}
			}
		}
		if(root==null){
			System.out.println("creating root node");
			root=newNode;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumLowestLevel bst=new SumLowestLevel(40);
		bst.insert(20);
		bst.insert(60);
		bst.insert(10);
		bst.insert(30);
		bst.insert(50);
		bst.insert(100);
		bst.insert(25);
		bst.insert(200);
		bst.insert(45);
		bst.insert(55);
		bst.insert(5);
		System.out.println(bst.sumLowLevel(bst.root));
		
	}

}

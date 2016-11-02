package BinarySearchTree;

public class BinaryTreeToLinkedList {

	public static Node BinaryToLinkedListUtil(Node root){
		if(root.left!=null){
			Node predessor=BinaryToLinkedListUtil(root.left);
			//predessor is right most element in left sub tree
			while(predessor.right!=null){
				predessor=predessor.right;
			}
			predessor.right=root;
			root.left=predessor;
		
		}
		if(root.right!=null){
			Node successor=BinaryToLinkedListUtil(root.right);
			while(successor.left!=null){
				successor=successor.left;
			}
			successor.left=root;
			root.right=successor;
			
		}
		return root;
	}
	public static Node BinaryToLinkedList(Node root){
		if(root==null){
			return null;
		}
		root=BinaryToLinkedListUtil(root);
		while(root.left!=null){
			root=root.left;
		}
		return root;
	}
	
	public static void printLL(Node root){
		Node current=root;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.right;
		}
	}
	public static void printTree(Node root){
		if(root!=null){
			printTree(root.left);
			System.out.print(root.data+" ");
			printTree(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ins=new Insert();
		Node root=ins.getSampleRoot();
		printTree(root);
		System.out.println();
		printLL(BinaryToLinkedList(root));
	}

}

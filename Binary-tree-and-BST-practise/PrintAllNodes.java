package BinarySearchTree;

public class PrintAllNodes {

	public void printSibling(Node node){
		if(node!=null){
			if(node.left==null){
				if(node.right!=null){
					System.out.println(node.right.data);
				}
			}
			if(node.right==null){
				if(node.left!=null){
					System.out.println(node.right.data);
				}
			}
		}
		printSibling(node.left);
		printSibling(node.right);
	}
	public static void main(String[] args){
		
	}
}

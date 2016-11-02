package BinarySearchTree;

import java.util.Stack;

public class SpiralTraversal {
	
	public static void spiralTraversal(Node root){
		Stack<Node> s1=new Stack<>();
		Stack<Node> s2=new Stack<>();
		if(root!=null){
//			/System.out.println("not null");
			s2.push(root);
		}
		while(!s1.isEmpty() || !s2.isEmpty()){
			Node current;
			if(!s2.isEmpty()){
				while(!s2.isEmpty()){
					current=s2.pop();
					System.out.print(current.data+" ");
					if(current.right!=null){
						s1.push(current.right);
					}
					if(current.left!=null){
						s1.push(current.left);
					}
				}
			}
			if(!s1.isEmpty()){
				while(!s1.isEmpty()){
					current=s1.pop();
					System.out.print(current.data+" ");
					if(current.left!=null){
						s2.push(current.left);
					}
					if(current.right!=null){
						s2.push(current.right);
					}
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spiralTraversal(new Insert().getSampleRoot());
	}

}

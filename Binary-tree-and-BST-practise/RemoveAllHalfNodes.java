package BinarySearchTree;

public class RemoveAllHalfNodes {
	
	public Node returnNode(Node root){
		if(root.left==null && root.right==null){
			return root;
		}else if(root.left==null&&root.right!=null){
			root=returnNode(root.right);
		}else if(root.left!=null&&root.right==null){
			root=returnNode(root.left);
		}
		return root;
	}
	
	public Node removeHalfNodes(Node root){
		if(root==null){
			return null;
		}
		if(root.left!=null&&root.right!=null){
			root.left=removeHalfNodes(root.left);
			root.right=removeHalfNodes(root.right);
		}else{
			root=returnNode(root);
		}
		return root;
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveAllHalfNodes obj=new RemoveAllHalfNodes();
		Node root = new Node(2);
        Node newRoot = null; 
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.right = new Node(6);
        root.left.right.left = new Node(1);
        root.left.right.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
        obj.display(root);
        newRoot=obj.removeHalfNodes(root);
        System.out.println();
        obj.display(newRoot);
	}

}

package BinarySearchTree;

public class IsTreeBST {
	

	
	public boolean isBST(Node root){
		if(root==null){
			return true;
		}
		if(root.left!=null&&root.right!=null){
			if(root.data>root.left.data&&root.right.data>root.data){
				return isBST(root.left)&&isBST(root.right); 
			}
		}
		if(root.left!=null && root.data>root.left.data){
			return isBST(root.left);
		}
		if(root.right!=null && root.data<root.right.data){
			return isBST(root.right);
		}
		return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

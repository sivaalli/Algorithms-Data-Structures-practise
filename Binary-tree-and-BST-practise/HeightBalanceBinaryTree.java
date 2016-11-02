package BinarySearchTree;



public class HeightBalanceBinaryTree {
	//this method return height of binary tree.
	public int height(Node root){
		if(root==null){
			//System.out.println("null");
			return 0;
		}else{
			return 1+Math.max(height(root.left), height(root.right));
		}
	}
	
	public boolean isheightBalanceTree(Node root){
		if(root==null){
			return true;
		}else{
			System.out.println(root.data);
			int heightLeftSubTree=height(root.left);
			System.out.println("height of left tree="+heightLeftSubTree);
			int heightRightSubTree=height(root.right);
			System.out.println("height of rikght tree="+heightRightSubTree);
			if(Math.abs(heightLeftSubTree-heightRightSubTree)<=1){
				return isheightBalanceTree(root.left)&&isheightBalanceTree(root.right);
			}else
				return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightBalanceBinaryTree hbt=new HeightBalanceBinaryTree();
		Insert ins=new Insert();
		Node root=ins.getSampleRoot();
		if(hbt.isheightBalanceTree(root)){
			System.out.println("balanced tree");
		}else
			System.out.println("not balanced");
		//System.out.println(hbt.height(root));
	}

}

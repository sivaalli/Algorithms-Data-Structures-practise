package BinarySearchTree;

public class SumTree {
	public int sumOfTree(Node root){
		if(root==null){
			return 0;
		}else{
			return root.data+sumOfTree(root.left)+sumOfTree(root.right);
		}
	}
	public Node sumTreeFn(Node root){
		if(root!=null){
			System.out.println("current node is "+root.data);	
			root.data=sumOfTree(root)-root.data;
			System.out.println("after caluclating sum "+root.data);
			root.left=sumTreeFn(root.left);
			root.right=sumTreeFn(root.right);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumTree st=new SumTree();
		Insert ins=new Insert();
		Node sumTreeRoot=st.sumTreeFn(ins.getSampleRoot());
		System.out.println(sumTreeRoot.data);
	}

}

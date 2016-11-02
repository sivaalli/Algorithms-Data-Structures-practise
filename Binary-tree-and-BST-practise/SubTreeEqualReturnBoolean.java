package BinarySearchTree;
//check if a tree is subtree of another.. return true or false;
//given t1>t2
public class SubTreeEqualReturnBoolean {

	public boolean treesEqual(Node t1,Node t2){
		if(t1==null&&t2==null){
			return true;
		}else if(t1==null||t2==null){
			return false;
		}
		
		if(t1.data==t2.data){
			return treesEqual(t1.left,t2.left)&&treesEqual(t1.right, t2.right);
		}
		return false;
	}
	public boolean subTrees(Node t1,Node t2){
		if(t1==null){
			return false;
		}
		if(treesEqual(t1,t2)){
			return true;
		}else{
			return subTrees(t1.left,t2)||subTrees(t1.right,t2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ins=new Insert();
		Insert2 ins2=new Insert2();
		SubTreeEqualReturnBoolean ste=new SubTreeEqualReturnBoolean();
		Node root1=ins.getSampleRoot();
		Node root2=ins2.getSampleRoot();
		if(ste.subTrees(root1, root2)){
			System.out.println("t2 is subtree of t1");
		}else{
			System.out.println("t2 is not a subtree of t1");
		}
	}

}

package BinarySearchTree;
//check if one binary tree is subset of another binary tree. if so return hieght of subtree
public class SubTreeEqual {
	
	public int subTreesEqual(Node a,Node b){
		if(a==null){
			return 0;
		}
		if(b==null){
			return 0;
		}
		if(a.data==b.data){
			return 1+subTreesEqual(a.left, b.left)+subTreesEqual(a.right, b.right);
		}
		return subTreesEqual(a.left, b)+subTreesEqual(a.right, b)+subTreesEqual(a, b.left)+subTreesEqual(a, b.right);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ins=new Insert();
		//Insert2 ins2=new Insert2();
		SubTreeEqual ste=new SubTreeEqual();
		Node root1=ins.getSampleRoot();
		//Node root2=ins2.getSampleRoot();
		System.out.println(ste.subTreesEqual(root1,root1)/2);
	}

}

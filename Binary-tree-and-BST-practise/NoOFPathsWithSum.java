package BinarySearchTree;

public class NoOFPathsWithSum {
	
	public int pathsWithSum(Node root,int sum){
		if(sum==0){
			return 1;
		}
		if(root==null){
			return 0;
		}
		return pathsWithSum(root.left,sum)+pathsWithSum(root.left,sum-root.data)+pathsWithSum(root.right,sum)+
				pathsWithSum(root.right,sum-root.data);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOFPathsWithSum obj=new NoOFPathsWithSum();
		Insert ins=new Insert();
		System.out.println(obj.pathsWithSum(ins.getSampleRoot(),110)/2);
	}

}

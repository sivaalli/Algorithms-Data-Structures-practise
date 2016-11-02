package BinarySearchTree;

public class SumOfTwoNumbers {
	
	public void sumNodes(Node root,int sum){
		if(root!=null){
			sumNodes(root.left,sum);
			int secNum=root.data;
			sumNodes(root.right,sum);
			int firstNum=root.data;
			sumNodes(root.right,sum);
			sumNodes(root.left,sum);
			sumNodes(root.left,sum);
			
		//	sumNodes(root.right,sum);
		
			System.out.println("n1="+firstNum+"	n2="+secNum);
			if(firstNum+secNum==sum){
				System.out.println("found");
			}
		}
	
	}

	public static void main(String[] args) {
		Insert ins=new Insert();
		SumOfTwoNumbers stn=new SumOfTwoNumbers();
		stn.sumNodes(ins.getSampleRoot(),35);
		
	}

}

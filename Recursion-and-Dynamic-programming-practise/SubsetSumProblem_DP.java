package recurssion_dynamicProgramming;

public class SubsetSumProblem_DP {
	
	public static boolean sspdp(int[] arr,int sum){
		int i=0;
		int j=0;
		boolean[][] matrix=new boolean[arr.length+1][sum+1];
		for(i=0;i<=arr.length;i++){
			matrix[i][0]=true;
		}
		
	
		for(i=1;i<=arr.length;i++){
			for(j=1;j<=sum;j++){
				if(arr[i-1]>j){
					//get value from top
					matrix[i][j]=matrix[i-1][j];
				}else
					matrix[i][j]=matrix[i-1][j]||matrix[i-1][j-arr[i-1]];
				}
			}
		for(int m=0;m<=arr.length;m++){
			for(int n=0;n<=sum;n++){
				System.out.print(matrix[m][n]+" ");
			}
			System.out.println();
		}
		
		return matrix[i-1][j-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,3,7,8,10};
		if(sspdp(arr,11)){
			System.out.println("there is a subset with given sum");
		}
		else{
			System.out.println("no sum ");
		}
	}

}

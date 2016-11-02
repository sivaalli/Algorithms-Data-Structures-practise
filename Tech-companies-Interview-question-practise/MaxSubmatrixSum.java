package smapleQuestionsAlgorithms;

public class MaxSubmatrixSum {
	
	public static int buildSumMatrix(int[][] arr,int m,int n){
		int[][] sum=new int[arr.length-m][arr[0].length-n];
		sum[0][0]=arr[m][n];
		int maxSum=sum[0][0];
		for(int i=1,x=m+1;i<sum.length;i++,x++){//top to down building sum
			sum[i][0]=sum[i-1][0]+arr[x][n];
			if(sum[i][0]>maxSum){
				maxSum=sum[i][0];
			}
		}
		for(int j=1,y=n+1;j<sum[0].length;j++,y++){
			sum[0][j]=sum[0][j-1]+arr[m][y];
			if(sum[0][j]>maxSum){
				maxSum=sum[0][j];
			}
		}
		
		for(int i=1,x=m+1;i<sum.length;i++,x++){
			for(int j=1,y=n+1;j<sum[i].length;j++,y++){
				sum[i][j]=arr[x][y]-sum[i-1][j-1]+sum[i][j-1]+sum[i-1][j];
				if(sum[i][j]>maxSum){
					maxSum=sum[i][j];
				}
			}
		}
		return maxSum;
		
	}
	
	public static int maxSum(int[][] arr){
		int maxSum=Integer.MIN_VALUE;
		int localSum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				localSum=buildSumMatrix(arr,i,j);
				System.out.println(localSum);
				if(localSum>maxSum){
					maxSum=localSum;
				}
			}
		}
		return maxSum;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 10, 1, 3},
                {-4, -1, 1, 7, -6}
                };
		System.out.println(maxSum(arr));
		
		
	}

}

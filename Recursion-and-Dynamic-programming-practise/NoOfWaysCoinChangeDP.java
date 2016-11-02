package recurssion_dynamicProgramming;

public class NoOfWaysCoinChangeDP {
	
	public static int dynamicProgrammingSoultion(int arr[],int amount){
		int[][] matrix= new int[arr.length][amount+1];
		
		for(int i=0;i<=amount;i++){
			matrix[0][i]=1;
		}
		for(int i=0;i<arr.length;i++){
			matrix[i][0]=1;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<=amount;j++){
				if(j%arr[i]==0){
					matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j])+1;
				}else{
					matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
				}
			}
		}
		return matrix[arr.length-1][amount];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,5,10,25};
		System.out.println(dynamicProgrammingSoultion(coins,25));
	}

}

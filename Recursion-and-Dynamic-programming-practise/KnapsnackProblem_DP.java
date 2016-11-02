package recurssion_dynamicProgramming;

public class KnapsnackProblem_DP {
	
	public static int max(int a, int b){
		return (a>b)? a:b;
	}
	public static int problem(int[]weig,int[] val,int w,int n){
		int[][] matrix=new int[n+1][w+1];
		int i=0,j = 0;
		for(i=0;i<=n;i++){
			for(j=0;j<=w;j++){
				if(i==0||j==0){
					matrix[i][j]=0;
				}else if(weig[i-1]<=j){
					matrix[i][j]=max(val[i-1]+matrix[i-1][j-weig[i-1]],matrix[i-1][j]);
					
				}else{
					matrix[i][j]=matrix[i-1][j];
				}
			}
		}

		for(i=0;i<=n;i++){
			for(j=0;j<=w;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		return matrix[i-1][j-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val={60,100,120};
		int[] weig={10,20,30};
		int w=50;
		System.out.println(problem(weig, val, w, val.length));
		
	}

}

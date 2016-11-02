package recurssion_dynamicProgramming;

public class LCS_DP {
	
	public static int max(int a, int b){
		return (a>b)? a:b;
	}
	
	public static int longestCommonSubSeq(String s1,String s2,int m,int n){
		int i=0,j=0;
		int[][] matrix=new int[m+1][n+1];
		for(i=0;i<=m;i++){
			for(j=0;j<=n;j++){
				if(i==0||j==0){
					matrix[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)){
					matrix[i][j]=matrix[i-1][j-1]+1;
				}else{
					matrix[i][j]=max(matrix[i-1][j],matrix[i][j-1]);
				}
			}
		}
		return matrix[i-1][j-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdaf";
		String s2="acbcf";
		System.out.println(longestCommonSubSeq(s1,s2,s1.length(),s2.length()));

	}

}

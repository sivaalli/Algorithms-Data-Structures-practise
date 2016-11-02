package recurssion_dynamicProgramming;

public class MatrixTraverse {

	
	public static int traverse(int i,int j,int m,int n){
		if(i==m-1&&j==n-1){
			return 1;
		}
		if(i==m||j==n){
			return 0;
		}
		return traverse(i+1,j,m,n)+traverse(i,j+1,m,n);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(traverse(0,0,5,5));
	}

}

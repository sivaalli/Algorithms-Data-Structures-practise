package recurssion_dynamicProgramming;

public class LongestPathMatrix {
	static int[][] arr={{1, 2, 9},
	        {5, 3, 8},
	        {4, 6, 7}};
	public static int lpm(int i,int j,int n){
		if((i+1<n&&j<n)&&(i+1>-1&&j>-1)){
			if(arr[i+1][j]-arr[i][j]==1){
				return 1+lpm(i+1,j,3);
			}
		}
		if((i<n&&j+1<n)&&(i>-1&&j+1>-1)){
				if(arr[i][j+1]-arr[i][j]==1){
					return 1+lpm(i,j+1,3);
				}
			}
		 if((i-1<n&&j<n)&&(i-1>-1&&j>-1)){
				if(arr[i-1][j]-arr[i][j]==1){
					return 1+lpm(i-1,j,3);
				}
			}
		if((i<n&&j-1<n)&&(i>-1&&j-1>-1)){
				if(arr[i][j-1]-arr[i][j]==1){
					return 1+lpm(i,j-1,3);
				}
			} 
				return 0;
			}
	

	

	public static void main(String[] args) {
		int maxPath=0;
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				//System.out.println(lpm(i,j,3));
				if(lpm(i, j, 3)>maxPath){
					maxPath=lpm(i, j, 3);
				}
			}
			 
		}
		System.out.println(maxPath+1);
	}

}

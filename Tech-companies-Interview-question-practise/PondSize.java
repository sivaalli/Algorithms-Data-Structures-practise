package smapleQuestionsAlgorithms;

public class PondSize {
	
	public static boolean valid(int i,int j){
		if(i<0||j<0){
			return false;
		}
		return true;
	}
	
	public static int[][] size(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int count=0;
				if(arr[i][j]==0){
					if(valid(i-1,j)){
						if(arr[i-1][j]>=0){
							count+=arr[i-1][j];
							arr[i-1][j]=-1;
						}
					}
					if(valid(i,j-1)){
						if(arr[i][j-1]>=0){
							count+=arr[i][j-1];
							arr[i][j-1]=-1;
						}
					}
					if(valid(i-1,j-1)){
						if(arr[i-1][j-1]>=0){
							count+=arr[i-1][j-1];
							arr[i-1][j-1]=-1;
						}
					}
					arr[i][j]=++count;
				}else{
					arr[i][j]=-1;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}};
		arr=size(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

package smapleQuestionsAlgorithms;

public class MatrixRotation {
	
	public static void rotate(int row,int col,int r,int arr[][]){
		int i=0,j=0;
		int total=2*(row-1)+2*(col-1);
		while(r>=total){
			r-=total;
		}
		int[] buffer=new int[r];
		for(int k=0;k<=r;k++){
			System.out.println(i+" "+j);
			if(k<r){
				buffer[k]=arr[i][j];
			}
			if(i==0 && j<col-1){
				j++;
			}else if(j==col-1 && i<row-1){
				i++;
			}else if(i==row-1 && j>0){
				j--;
			}else if(j==0 && i>0){
				i--;
			}	
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4,col=4;
		int r=14;
		int[][] arr={};
	
	}

}

package smapleQuestionsAlgorithms;

public class Rotate90degreeMatrix {
	
	public static void rotate(int[][] arr,int n){
		int last=n-1;
		for(int row=0;row<n/2;row++,last--){
			System.out.println("row "+row);
			int dec=last;
			for(int col=row;col<last;col++,dec--){
				System.out.println("col "+col);
				int dummy=arr[row][col];
				arr[row][col]=arr[dec][row];
				arr[dec][row]=arr[last][dec];
				arr[last][dec]=arr[col][last];
				arr[col][last]=dummy;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4,5,26},{6,7,8,9,10,27},{11,12,13,14,15,28},{16,17,18,19,20,29},{21,22,23,24,25,30},{31,32,33,34,35,36}};
		rotate(arr,6);
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

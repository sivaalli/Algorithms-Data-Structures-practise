package smapleQuestionsAlgorithms;

public class SpiralTraverseMatrix {
	
	public static void spiralTraversal(int[][] arr,int n){
		int last=n-1;
		for(int row=0,col=0;row<=n/2;row++,col++,last--){
			for(int i=col;i<last;i++){
				System.out.print(arr[row][i]+" ");
			}
			for(int i=row;i<last;i++){
				System.out.print(arr[i][last]+" ");
			}
			for(int i=last;i>col;i--){
				System.out.print(arr[last][i]+" ");
			}
			for(int i=last;i>row;i--){
				System.out.print(arr[i][col]+" ");
			}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4,5,26},{6,7,8,9,10,27},{11,12,13,14,15,28},{16,17,18,19,20,29},{21,22,23,24,25,30},{31,32,33,34,35,36}};
		spiralTraversal(arr,6);
		
	}

}

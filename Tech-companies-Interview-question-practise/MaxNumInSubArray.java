package smapleQuestionsAlgorithms;

public class MaxNumInSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,1,4,5,2,3,6};
		int k=3;
		int max;
		for(int i=0;i<arr.length-k+1;i++){
			max=Integer.MIN_VALUE;
			for(int j=i;j<k+i;j++){
				if(arr[j]>max){
					max=arr[j];
				}
			}	
			System.out.print(max+" ");
		}
	}

}

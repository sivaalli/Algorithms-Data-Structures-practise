package smapleQuestionsAlgorithms;


public class LIS {

	public static void main(String[] args){
		int[] arr={10,22,9,33,21,50,41,60,80};
		int count=1;
		for(int i=0,j=1;i<arr.length&&j<arr.length;j++){
			if(arr[i]<arr[j]){
				i=j;
				count=count+1;
			}
			
		}
		System.out.println(count);
	}
}

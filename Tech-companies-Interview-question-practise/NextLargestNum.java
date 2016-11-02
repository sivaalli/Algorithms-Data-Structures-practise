package smapleQuestionsAlgorithms;

public class NextLargestNum {
	public static void main(String args[]){
		int arr[]={1,3,2,4};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					System.out.println(arr[j]);
					break;
				}
			}
		}
		System.out.println("-1");
	}
}

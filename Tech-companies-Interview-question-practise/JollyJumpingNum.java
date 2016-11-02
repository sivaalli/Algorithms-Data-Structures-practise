package smapleQuestionsAlgorithms;

public class JollyJumpingNum {
	public static void main(String[] args){
		int arr[]={1,4,2,3};
		int seqStart = Math.abs(arr[1]-arr[0]);
		for(int i=1;i<arr.length;i++,seqStart--){
			if(Math.abs(arr[i]-arr[i-1])!=seqStart){
				System.out.println("not a jolly sequence");
				return;
			}
		}
		System.out.println("a Jolly sequence");
	}
}

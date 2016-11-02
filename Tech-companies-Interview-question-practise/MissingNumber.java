package smapleQuestionsAlgorithms;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8,10};
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1!=arr[i+1]){
				System.out.println(arr[i]+1);
				break;	
			}
		}
	}

}

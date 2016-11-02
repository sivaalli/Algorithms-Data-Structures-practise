package smapleQuestionsAlgorithms;

public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,100,42,4,23};
		int product=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]*arr[j]>product){
					product=arr[i]*arr[j];
				}
			}
			
		}
		System.out.println(product);
	}

}

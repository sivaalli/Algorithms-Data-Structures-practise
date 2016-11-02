package smapleQuestionsAlgorithms;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-2,-1,-3};
		int maxSum=arr[0],sum=0;
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				if(sum>maxSum){
					maxSum=sum;
				}
			}
		}
		System.out.println(maxSum);
	}

}

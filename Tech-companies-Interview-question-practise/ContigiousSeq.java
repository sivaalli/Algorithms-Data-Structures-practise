package smapleQuestionsAlgorithms;
///page 183
public class ContigiousSeq {
	
	public int maxSum(int[] arr){
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
				if(sum>maxSum){
					System.out.println(sum);
					maxSum=sum;
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,-8,3,-2,4,-10};
		System.out.println(new ContigiousSeq().maxSum(arr));
	}

}

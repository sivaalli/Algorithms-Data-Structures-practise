package smapleQuestionsAlgorithms;

public class MaxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {2,3,7,10,12};
		int[] arr2 = {1,5,7,8};
		int index2=0;
		int sum1=0;
		int sum2=0;
		for(int i=0;arr1[i]!=arr2[i];i++){
			sum1=sum1+arr1[i];
			sum2=sum2+arr2[i];
			index2=i;
		}
		for(int i=index2+1;i<arr2.length;i++){
			sum1=sum1+arr2[i];
		}
		for(int i=index2+1;i<arr1.length;i++){
			sum2=sum2+arr1[i];
		}
		
		if(sum1>sum2){
			System.out.println(sum1);
		}
		else
			System.out.println(sum2);

}
}

package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=700254
public class LargestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int subArray=0,maxSubArray=0;
		int start=0,end=0;
		int[] arr={15,-2,2,-8,1,7,10,23};
		for(int i=0;i<arr.length;i++){
			sum=0;
			for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				if(sum==0){
					subArray=j-i;
					if(maxSubArray<subArray){
						start=i;
						end=j;
						maxSubArray=subArray;
					
					}
					
				}
			}
		}
		System.out.println(start+","+end);
	}

}

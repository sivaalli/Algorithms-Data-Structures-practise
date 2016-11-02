package recurssion_dynamicProgramming;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=494
public class MaxSumIncSubseq {
	
	public static int max(int a,int b){
		return (a>b)? a:b;	
	}
	
	public static int maxSumSubseq(int[] arr,int i,int ele,int sumCal){
		//if i>arr.length then return sumCal.this is sum of total subsequences in incread=sing order
		if(i>arr.length-1){
			return sumCal;
		}
		//if element is greater than present present ith value then move forward
		//unti u find next greates value
		if(ele>arr[i]){
			return maxSumSubseq(arr,i+1,ele,sumCal);
		}
		//either include this element in sum and change element to arr[i] or move forward with same element
		return max(maxSumSubseq(arr,i+1,arr[i],sumCal+arr[i]),maxSumSubseq(arr,i+1,ele,sumCal));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,101,2,3,100,4,5};
		System.out.println(maxSumSubseq(arr,1,arr[0],arr[0]));
	}

}

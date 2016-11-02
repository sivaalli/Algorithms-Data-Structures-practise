package recurssion_dynamicProgramming;
//http://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
//very brilliant recurssion...refer ocassionally
//point:include nth element and substract from the sum or move to next last element without substracting
public class SubsetSumProblem {
	
	public static boolean isSubsetSum(int[] arr,int sum,int i){
		if(sum==0){
			return true;
		}
		if(i==-1 && sum!=0){
			return false;
		}
		if(arr[i]>sum){
			isSubsetSum(arr,sum,i-1);
		}
		return isSubsetSum(arr,sum-arr[i],i-1)||isSubsetSum(arr,sum,i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,34,4,12,5,2};
		if(isSubsetSum(arr,10,arr.length-1)){
			System.out.println("subset has a sum");
		}
		else
			System.out.println("no subset with sum");
		
	}

}

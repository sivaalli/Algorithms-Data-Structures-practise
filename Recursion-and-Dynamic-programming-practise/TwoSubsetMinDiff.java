package recurssion_dynamicProgramming;
//http://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/

public class TwoSubsetMinDiff {
	public static int min(int a, int b){
		return a>b ? b:a;//reg exp
	}
	public static int minDifference(int[] arr,int computedSum,int totalsum,int i){
		if(i==-1){
			return Math.abs((totalsum-computedSum)-computedSum);
		}
		return min(minDifference(arr,computedSum+arr[i],totalsum,i-1),minDifference(arr,computedSum,totalsum,i-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,6,11,5};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		//System.out.println(sum);
		System.out.println(minDifference(arr,0,sum,arr.length-1));
	}

}

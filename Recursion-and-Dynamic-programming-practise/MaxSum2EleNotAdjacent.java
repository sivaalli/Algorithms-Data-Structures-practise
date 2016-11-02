package recurssion_dynamicProgramming;
//max summ of array such that no 2 elements are adjacent

public class MaxSum2EleNotAdjacent {

	public int maxSum(int[] arr,int i){
		if(i<0){
			return 0;
		}else{
			return Math.max(maxSum(arr,i-1), arr[i]+maxSum(arr,i-2));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,2,5,10,7};
		MaxSum2EleNotAdjacent obj=new MaxSum2EleNotAdjacent();
		System.out.println(obj.maxSum(arr, arr.length-1));
	}

}

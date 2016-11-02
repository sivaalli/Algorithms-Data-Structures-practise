package recurssion_dynamicProgramming;


public class LIS {
	
	public static int returnLIS(int[] arr,int prevEle,int i){
		if(i==arr.length){
			return 0;
		}
		if(arr[i]>prevEle){
			return 1+returnLIS(arr,arr[i],i+1);
		}else{
			return Math.max(returnLIS(arr,arr[i],i+1), returnLIS(arr,prevEle,i+1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,10,2,3,4,5,6,7,8};
		System.out.println(1+returnLIS(arr,arr[0],1));
	}

}

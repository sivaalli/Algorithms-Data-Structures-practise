package recurssion_dynamicProgramming;

public class NoOfWaysCoinChange {
	
	public static int returnNoOfWays(int[] arr,int n,int i){
		if(n==0){
			return 1;
		}
		if(i==-1){
			return 0;
		}
		if(arr[i]>n){
			return returnNoOfWays(arr,n,i-1);
		}else{
			return returnNoOfWays(arr,n-arr[i],i)+returnNoOfWays(arr,n,i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,5,10,25};
		System.out.println(returnNoOfWays(coins,25,3));
	}

}

package recurssion_dynamicProgramming;
//refer for DP
public class CoinChange {

	public static int min(int a,int b){
		return (a>b)? b:a;	
	}
	public static int cc(int[] arr,int total,int i){
		if(total==0){
			return 0;
		}
		if(i==-1){
			return Integer.MAX_VALUE;
		}
		if(total<arr[i]){
			return cc(arr,total,i-1);
		}else{
			return min(1+cc(arr,total-arr[i],i),cc(arr,total,i-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,10,25};
		System.out.println(cc(arr,11,arr.length-1));
	}

}

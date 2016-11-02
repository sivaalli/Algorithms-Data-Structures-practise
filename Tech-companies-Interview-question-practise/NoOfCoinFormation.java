package smapleQuestionsAlgorithms;

public class NoOfCoinFormation {

	public static int ways(int i,int total,int[] arr){
		if(total<0){
			return 0;
		}
		if(total==0){
			return 1;
		}
		int nWays=0;
		if(arr[i]>total){
			return 0;
		}
		for(int j=i;j<arr.length;j++){
			nWays+=ways(j,total-arr[j],arr);
		}
		return nWays;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,10,25};
		System.out.println(ways(0,25,arr));
	}

}

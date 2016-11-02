package smapleQuestionsAlgorithms;
//memonization
public class TheMasseuse {

	public static int findMaxMin(int[] arr,int i,int[] memo){
		if(i>=arr.length){
			return 0;
		}
		if(memo[i]==0){
			int with=arr[i]+findMaxMin(arr,i+2,memo);
			int without=findMaxMin(arr,i+1,memo);
			memo[i]=Math.max(with, without);
		}
		return memo[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={30,15,60,75,45,15,15,45};
		int memo[]=new int[arr.length];
		System.out.println(findMaxMin(arr,0,memo));
		
	}

}


package smapleQuestionsAlgorithms;

public class CoinChange {
	public static int[] s={1,2,3};
	public static int count(int total){
		if(total>0){
				return count(total-s[0])+count(total-s[1])+count(total-s[2]);
		}
		if(total==0){
			return 1;
		}
		return 0;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(count(4));
	
	}
}

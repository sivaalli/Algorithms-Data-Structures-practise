package smapleQuestionsAlgorithms;
//
//Find the nth number that contains the digit k or is divisible by k. (2 <= k <= 9)
//Example –
//if n = 15 & k = 3
//Answer : 33
//(3, 6, 9, 12, 13, 15, 18, 21, 23, 24, 27, 30, 31, 32, 33)
//
public class NthNumber {
	
	
	public static boolean contains(int n,int k){
		String n1=Integer.toString(n);
		String n2=Integer.toString(k);
		if(n1.contains(n2)){
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int k=3;
		for(int i=0;i<100;i++){
			if(i>=3&&(i%3==0||contains(i,k))){
				count++;

					if(count==15){
						System.out.println(i);
					}
			}
		}
		
	}
	

}

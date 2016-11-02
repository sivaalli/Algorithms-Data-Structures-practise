package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=389
public class JumpingNumbers {
	public static int n=100;
	public static void JN(int n){
		if(n*10<JumpingNumbers.n){
			String num=Integer.toString(n);
			char lastDigit=num.charAt(num.length()-1);
			int ld=(int)lastDigit-48;
			if(ld!=0){
				System.out.println(n*10+(ld-1));		
			}
			System.out.println(n*10+(ld+1));
			if(ld!=0){
				JN(n*10+(ld-1));	
			}
			JN(n*10+(ld+1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0");
		for(int i=1;i<10;i++){
			JN(i);
		}	
	}
}

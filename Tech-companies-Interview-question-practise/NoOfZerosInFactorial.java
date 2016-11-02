package smapleQuestionsAlgorithms;

public class NoOfZerosInFactorial {
	
	public int factorial(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(i%5==0 && i%10!=0){
				count++;
			}
			for(int j=i,m=10;j%m==0;m=m*10){
				count++;
			}
		}
		return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2000;
		System.out.println(new NoOfZerosInFactorial().factorial(n));
	}

}

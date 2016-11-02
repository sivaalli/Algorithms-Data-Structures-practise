package smapleQuestionsAlgorithms;
//one of the good programs
public class SquareRoot {
	
	public static double sqRoot(double n){
		double num=0.0d;
		double adder=1.0d;
		double iterator=0.0d;
		for(int j=0;j<7;j++){//running for 2 decimal points
			for(double i=iterator;i<n;i=i+adder){
				if(i*i<n){
					num=i;
				}
				else if(i*i==n){
					return i;
				}
			}
			iterator=num;
			adder=adder*0.1d;
		}
		
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=148.84;
		System.out.println(sqRoot(n));
		
	}

}

package smapleQuestionsAlgorithms;

public class MultiplySubstractDivide {
	public int multilpy(int a, int b){
		int max=0;
		int min=0;
		if(a>b){
			max=a;
			min=b;
		}else
		{max=b;min=a;}
		int number=0;
		for(int i=0;i<min;i++){
			number+=max;
		}
		return number;
	}
	public int divide(int a,int b){
		if(a<b){
			return 0;
		}
		int count=0;
		int number=0;
		for(int i=1;i<=a;i++){
			count++;
			if(count==b){
				number++;
				count=0;
			}
		}
		return number;
	}
	public int substract(int a, int b){
		int number=0;
		for(int i=b;i<a;i++){
			number++;
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplySubstractDivide obj=new MultiplySubstractDivide();
		System.out.println(obj.multilpy(9, 2));
		System.out.println(obj.divide(9, 2));
		System.out.println(obj.substract(9, 2));
		
	}

}

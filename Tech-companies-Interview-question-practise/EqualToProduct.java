package smapleQuestionsAlgorithms;

public class EqualToProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=2;
		int product;
		boolean flag=false;
		int[] num={1,2,3,4,5};
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				product=num[i]*num[j];
				if(product==p)
						flag=true;
				
			}
		}
		if(flag){
			System.out.println("yes");
		}
			else 
				System.out.println("no");
		}
	}



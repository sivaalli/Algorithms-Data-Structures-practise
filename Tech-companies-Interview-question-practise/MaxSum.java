package smapleQuestionsAlgorithms;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0;
		boolean flag=true;
		int[] arr={3,2,5,10,7};
		for(int i=0;i<arr.length;i++){
			if(flag){
				sum1=sum1+arr[i];
				flag=false;
			}
			else{
				sum2=sum2+arr[i];
				flag=true;
			}
			
		}
		if(sum1>sum2){
			System.out.println(sum1);
		}
		else
			System.out.println(sum2);
		
	}

}

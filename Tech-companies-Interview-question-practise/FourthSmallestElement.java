package smapleQuestionsAlgorithms;

public class FourthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,10,18,15,20,8,5};
		int dummy;
		int min;
		for(int i=0;i<num.length;i++){
			min=i;
			for(int j=i+1;j<num.length;j++){
				if(num[j]<num[min]){
					min=j;
				}
				//swap i and min;
				dummy=num[min];
				num[min]=num[i];
				num[i]=dummy;
				
				
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		
	}

}

package smapleQuestionsAlgorithms;

public class FourthLargestNum {

	public static void  main(String[] args){
		//int[] num={10,11,12,13,14,15,16,17,18};
		int[] num={18,17,16,15,14,13,12,11};
		int dummy;
		for(int i=0;i<4;i++){
			for(int j=0;j<num.length-1-i;j++){
				if(num[j]>num[j+1]){
					//swap j and j+1 position
					dummy=num[j];
					num[j]=num[j+1];
					num[j+1]=dummy;
				}
			}
			System.out.println(num[num.length-1-i]);
		}
		System.out.println("4th largest number="+num[num.length-4]);
	}
}

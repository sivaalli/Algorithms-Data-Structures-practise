package smapleQuestionsAlgorithms;

public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={12,1,18,11,10,15,20,8,5};
		double minDiff=999.0d,diff=0.0d;;
		int element=0;
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];		
		}
		double average=(double)sum/num.length;
		System.out.println(average);
		for(int i=0;i<num.length;i++){
			diff=average-num[i];
			if(diff<0){
				diff=-1*diff;
			}
			if(diff<minDiff){
				minDiff=diff;
				element=i;
			}
		}
		System.out.println(element);
		
	}

}

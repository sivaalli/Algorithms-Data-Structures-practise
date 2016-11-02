package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=444
public class PosNegArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-9,-4,2,1,-5,0,-5,3,-2};
		boolean flag=true;
		if(arr[1]<0){
			flag=false;
		}
		int dummy=0;
		for(int i=1;i<arr.length-1;i++){
			if(i%2!=0){
				if((arr[i]>=0&&flag)||(arr[i]<0&&!flag)){
					dummy=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=dummy;
				}
			}			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}

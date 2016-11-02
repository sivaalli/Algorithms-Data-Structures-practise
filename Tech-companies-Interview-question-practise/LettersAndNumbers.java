	package smapleQuestionsAlgorithms;

public class LettersAndNumbers {
	
	public static int MaxSubArray(char[] arr,int i,int j){
		if(i==j){
			return Integer.MIN_VALUE;
		}
		if(j<i){
			return 0;
		}
		if((arr[i]>='0'&&arr[i]<='9'&&arr[j]>='a'&&arr[j]<='z')&&(arr[i-1]>='0'&&arr[i-1]<='9'&&arr[j+1]>='a'&&arr[j+1]<='z')){
			//System.out.println(arr[i]);
			return 2+MaxSubArray(arr,i+1,j-1);
		}else if((arr[i]>='a'&&arr[i]<='z'&&arr[j]>='0'&&arr[j]<='9')&&(arr[i-1]>='a'&&arr[i-1]<='z'&&arr[j+1]>='0'&&arr[j+1]<='9')){
			return 2+MaxSubArray(arr,i+1,j-1);
		}
		else{
			return Math.max(MaxSubArray(arr,i+1,j), MaxSubArray(arr,i,j-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'0','1','2','a','b','0','1','2','3','a','b','c','d','4','5','6'};
		System.out.println(MaxSubArray(arr,1,arr.length-2));
	}
	
	
}
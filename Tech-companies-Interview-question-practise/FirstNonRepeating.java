package smapleQuestionsAlgorithms;

public class FirstNonRepeating {

	public static  char firstNonRepeating(int[] arr, String s){
		for(int i=0;i<s.length();i++){
			int index=(int)s.charAt(i);
			if(arr[index]==0){
				arr[index]=i;//we are encountering character for first time
			}else{
				arr[index]=-1;//means char is repeated.
			}
		}
		int min=Integer.MAX_VALUE;
		char first = ' ';
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min && arr[i]>0){
				min=arr[i];				
				first=(char) i;
			}
		}
		return first;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[128];//lets assume string is 128 ASCII char set
		System.out.println(firstNonRepeating(arr, "abcdefedcab"));
	}

}

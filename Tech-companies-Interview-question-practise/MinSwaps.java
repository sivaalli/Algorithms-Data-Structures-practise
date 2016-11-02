/*package smapleQuestionsAlgorithms;

import java.util.HashMap;

public class MinSwaps {
	
	public static int[] swap(int[] arr,int num,int i,int len){
		int[] newArray=arr.clone();
		newArray[i]=arr[i];
		newArray
		for(int j=0;j<len;j++){
			if(i!=j && arr[j]==num){
				arr[j]=dummy;
			}
		}
	}

	public static int minSwaps(int[] arr,int i,int len,HashMap<Integer,Integer> hashMap){
		if(i==len){
			return 0;
		}
		if(hashMap.containsKey(arr[i]) && hashMap.get(arr[i])==arr[i+1]){
			return minSwaps(arr,i+2,len,hashMap);
		}else{
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
*/
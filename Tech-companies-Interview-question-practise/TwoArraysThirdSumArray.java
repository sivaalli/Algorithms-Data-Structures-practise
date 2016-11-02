package smapleQuestionsAlgorithms;

import java.util.HashMap;

//very optimised version
//time complexity=x*y+z
public class TwoArraysThirdSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5};
		int[] arr2={6,7,8,9,10};
		int[] arr3={11,15,21,100,50};
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				hashMap.put(arr1[i]+arr2[j],"i="+Integer.toString(i)+"j="+Integer.toString(j));
			}
		}
		for(int i=0;i<arr3.length;i++){
			if(hashMap.containsKey(arr3[i])){
				System.out.println(hashMap.get(arr3[i]));
			}
		}
		
	}

}

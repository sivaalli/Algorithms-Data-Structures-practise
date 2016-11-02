package smapleQuestionsAlgorithms;

import java.util.HashMap;

public class ShortestSuperSequence {
	
	public static HashMap<Integer,Integer> buildHashMap(int[] shorter,int[] arr){
		int count=0;
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int i=0;i<shorter.length;i++){
			count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			hashMap.put(shorter[i], count);
		}
		return hashMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] shorter={1,5,9};
		int[] arr={7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7};
		HashMap<Integer,Integer>hashMap=buildHashMap(shorter,arr);
		int startP=0,endP=arr.length-1,start=0,end=0;
		System.out.println(hashMap);
		while(startP!=endP){
			if(!hashMap.containsKey(arr[startP])){
				start=startP;
				System.out.println("start--");
			}else{
				if(hashMap.get(arr[startP])!=null && hashMap.get(arr[startP])>1){
					System.out.println(arr[startP]+"start");
					hashMap.put(arr[startP], hashMap.get(arr[startP])-1);
					start=startP;
				}
			}
			if(!hashMap.containsKey(arr[endP])){
				System.out.println("end--");
				end=endP;
			}else{
				if( hashMap.get(arr[endP])!=null && hashMap.get(arr[endP])>1 ){
					System.out.println(arr[endP]+"end");
					hashMap.put(arr[endP], hashMap.get(arr[endP])-1);
					end=endP;
				}
			}
			startP++;
			endP--;
		}
		System.out.println(start+" "+end);
		
	}

}

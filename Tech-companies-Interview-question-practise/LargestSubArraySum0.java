/**
 * 
 */
package smapleQuestionsAlgorithms;

import java.util.HashMap;

/**
 * @author Siva
 * time complexity is O(n) using HashMap
 */
public class LargestSubArraySum0 {

	/**
	 * @param args
	 */
	public static int largest(int[] arr){
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		int sum=0,len=0,maxLen=0;
		hashMap.put(0, -1);
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(!hashMap.isEmpty() && hashMap.containsKey(sum)){
				len=i-hashMap.get(sum);
				if(len>maxLen){
					maxLen=len;
				}
			}else{
				hashMap.put(sum, i);
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={15 , -2 , 2,  -8,  1,  7,  -23, 23};
		System.out.println(largest(arr));
	}

}

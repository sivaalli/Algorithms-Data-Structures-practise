package smapleQuestionsAlgorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;





public class SortByFrequency {
	
	 class CompInt implements Comparator<Integer>{

		
		public int compare(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			if(arg1>arg0){
				return 1;
			}else if(arg0>arg1){
				return -1;
			}else{
				return 0;
			}
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> hashMap=new HashMap<>();
		SortByFrequency obj=new SortByFrequency();
		SortByFrequency.CompInt objInner=obj.new CompInt();
		Map<Integer,Set<Integer>> treeMap=new TreeMap<>(objInner);
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n>0){
			n--;
			int len=in.nextInt();
			int[] arr=new int[len];
			for(int i=0;i<len;	i++){
				arr[i]=in.nextInt();
			}
			for(int i=0;i<arr.length;i++){
				if(!hashMap.isEmpty() && hashMap.containsKey(arr[i])){
					hashMap.put(arr[i], hashMap.get(arr[i])+1);
				}else{
					hashMap.put(arr[i], 1);
				}
			}
			
			for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
				if(!treeMap.isEmpty() && treeMap.containsKey(entry.getValue())){
					Set<Integer> dupSet=treeMap.get(entry.getValue());
					dupSet.add(entry.getKey());
					treeMap.put(entry.getValue(), dupSet);
				}else{
					Set<Integer> set=new TreeSet<>();
					set.add(entry.getKey());
					treeMap.put(entry.getValue(),set );
				}
			}
			for(Map.Entry<Integer, Set<Integer>> mapEntry:treeMap.entrySet()){
				int count=mapEntry.getKey();
				Set<Integer> set=mapEntry.getValue();
				Iterator<Integer> itr=set.iterator();
				while(itr.hasNext()){
					int num=itr.next();
					for(int i=0;i<count;i++){
						System.out.print(num+" ");
					}
				}

			}
		}
		in.close();
		
		
	}

}

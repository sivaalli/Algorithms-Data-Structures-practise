package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class verticalOrderPrint {
	
	public static void insertHashMap(TreeMap<Integer,List<Integer>> hashMap,int vd,int data){
		if(!hashMap.isEmpty() && hashMap.containsKey(vd)){
			List<Integer> list=hashMap.get(vd);
			list.add(data);
		}else{
			List<Integer> list=new ArrayList<>();
			list.add(data);
			hashMap.put(vd, list);
		}
	}
	
	public static void printVertical(TreeMap<Integer,List<Integer>> hashMap,Node root,int vd){
		if(root!=null){
			insertHashMap(hashMap,vd,root.data);
			printVertical(hashMap,root.left,vd-1);
			printVertical(hashMap,root.right,vd+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Insert().getSampleRoot();
		TreeMap<Integer,List<Integer>> hashMap=new TreeMap<>();
		printVertical(hashMap, root, 0);
		for(Map.Entry<Integer,List<Integer>> entry:hashMap.entrySet()){
			
			System.out.print(entry.getValue());
			System.out.println();
		}
	}

}

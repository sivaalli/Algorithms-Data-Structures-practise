package smapleQuestionsAlgorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordBreak {
	
	public static void buildWords(String s,ArrayList<String> list,Set<String> set,String builder){
		if(s.isEmpty()){
			list.add(builder.trim());
		}else{
			for(int i=0;i<=s.length();i++){
				String first=s.substring(0,i);
				String second=s.substring(i);
				if(set.contains(first)){
					buildWords(second,list,set,builder+first+" ");
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		Set<String> set=new TreeSet<>(); 
		int n=in.nextInt();
		while(n>0){
			n--;
			int len=in.nextInt();
			set.clear();
			list.clear();
			for(int i=0;i<len;i++){
				set.add(in.next());
			}
			String s=in.next();
			buildWords(s,list,set,"");
			if(list.isEmpty()){
				System.out.println("Empty");
			}else{
				Iterator<String> itr=list.iterator();
				while(itr.hasNext()){
					System.out.print("(");
					System.out.print(itr.next());
					System.out.print(")");
				}
			}
		}
		in.close();	
	}

}

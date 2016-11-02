package smapleQuestionsAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class comp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if (o1.length() > o2.length()) {
		      return -1;
		    } else if (o1.length() < o2.length()) {
		      return 1;
		    } else {
		      return 0;
		    }
	}
}

public class LongestWord {
	
	public static String buildString(String word,String combination,String newWord){
		for(int i=word.length(),j=0;i<=combination.length();i++,j++){
			if(word.equals(combination.substring(j,i))){
				newWord=newWord.substring(0,j)+word+newWord.substring(i);
			}
		}
		return newWord;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"cat","banana","dog","nana","walk","walker","dogwalker","catbananadogcat","walknana"};
		Arrays.sort(arr,new comp());//sort by lengths
		String newWord;
		for(int i=0;i<arr.length;i++){
			char[] chars=new char[arr[i].length()];
			newWord=new String(chars);
			for(int j=0;j<arr.length;j++){
				if(i==j){
					continue;
				}
				if(arr[i].contains(arr[j])){
					newWord=buildString(arr[j],arr[i],newWord);		
				}
			}
			if(newWord.equals(arr[i])){
				System.out.println(arr[i]);
			}
		}
	}
}

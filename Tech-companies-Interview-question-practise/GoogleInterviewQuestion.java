package smapleQuestionsAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class GoogleInterviewQuestion {
	//swap positions. used for makeSentence() function
	public static String swapStringIndexes(String s, int i, int j){
		char[] arr=s.toCharArray();
		char dummy=arr[i];
		arr[i]=arr[j];
		arr[j]=dummy;
		return new String(arr);
	}
	//Generates permutations of string and returns a string if it is found in dictionary or return ""
	public static String wordExists(String s,Set<String> dictionary,int i,int j){
		if(i==j){
			if(dictionary.contains(s)){
				return s;
			}
		}else{
			for(int k=i;k<j;k++){
				String found=wordExists(swapStringIndexes(s, i, k),dictionary,i+1,j);
				if(!found.isEmpty()){
					return found;
				}
			}
		}
		return "";
	}
	//return sentence if can be formed with the given string or return ""
	public static String makeSentence(String s,Set<String> dictionary,String sentenceBuilder){
		if(s.isEmpty()){
			return sentenceBuilder; //sentenceBuilder;
		}else{
			for(int i=1;i<=s.length();i++){
				String first=s.substring(0,i);
				String second=s.substring(i);
				String foundWord=wordExists(first, dictionary, 0, i);
				if(!foundWord.isEmpty()){
					String sentence=makeSentence(second, dictionary, sentenceBuilder+foundWord+" ");
					if(!sentence.isEmpty()){
						return sentence;
					}
				}
			}
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dictionary=new HashSet<>();
		dictionary.add("hello");
		dictionary.add("he");	
		dictionary.add("to");
		dictionary.add("the");
		dictionary.add("world");
		System.out.println(makeSentence("elhloothtedrowl", dictionary,""));
	}

}

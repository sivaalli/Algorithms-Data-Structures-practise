package smapleQuestionsAlgorithms;

import java.util.Arrays;

//http://www.geeksforgeeks.org/amazon-interview-experience-set-276-on-campus-sde-i/
public class Patternmatching {
	
	public static int[] converToIntArray(String s){
		int count=0;
		char dummy;
		int str[]=new int[s.length()];
		for(int i=0;i<str.length;i++){
			count=0;
			//get char and count no of occurance in string or pattern
			dummy=s.charAt(i);
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)==dummy){
					count++;
				}
			}
			//at which this char appears with the count value
			for(int j=0;j<str.length;j++){
				if(s.charAt(j)==dummy){
					str[j]=count;
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="redblueredgreen";
		String s1="xyxz";
		s=s.replaceAll("red", "a");
		s=s.replaceAll("blue","b");
		s=s.replaceAll("green", "c");
		if(s.length()!=s1.length()){
			System.out.println("string doesnot match pattern");
			return;
		}
		int[] str=new int[s.length()];
		int[] pat=new int[s.length()];
		str=converToIntArray(s);
		pat=converToIntArray(s1);
		if(Arrays.equals(str, pat)){
			System.out.println("string matches pattern");
		}
		else
			System.out.println("string doesnot match pattern");
	}

}

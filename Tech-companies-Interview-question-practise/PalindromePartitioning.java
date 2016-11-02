package smapleQuestionsAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class PalindromePartitioning {
	
	public static boolean palindrome(String s){
		if(s.isEmpty()){
			return false;
		}
		if(s.charAt(0)!=s.charAt(s.length()-1)){
			return false;
		}
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
//	static int count_palindromes(String S){
	//	Set<String> set=new HashSet<>();
		
//	}
	
	public static int noOfCuts(String S){
		if(palindrome(S)){
			return 0;
		}
		int minCuts=S.length();
		for(int i=0;i<S.length();i++){
			for(int j=i+1;j<=S.length();j++){
					if(palindrome(S.substring(i,j))){
						int value=i+1+noOfCuts(S.substring(j));
						if(value<minCuts){
							minCuts=value;
						}
					}
				}
			}
		return minCuts;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(1+Integer.MAX_VALUE);
			String s="abcd";
			System.out.println(noOfCuts(s));
	}

}

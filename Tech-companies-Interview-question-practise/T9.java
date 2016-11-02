package smapleQuestionsAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class T9 {
	
	public static void words(String word,String number,int i,HashMap<Integer,char[]> hashMap){
		if(i==number.length()){
			System.out.println(word);
		}else{
			int num=Character.getNumericValue(number.charAt(i));
			for(int j=0;j<hashMap.get(num).length;j++){
				words(word+hashMap.get(num)[j],number,i+1,hashMap);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number="8733";
		HashMap<Integer,char[]> hashMap=new HashMap<>();
		hashMap.put(1,null );
		char[]  zero={};
		char[] one={'a','b','c'};
		char[] two={'d','e','f'};
		char[] three={'g','h','i'};
		char[] four={'j','k','l'};
		char[] five={'m','n','o'};
		char[] six={'p','q','r','s'};
		char[] seven={'t','u','v'};
		char[] eight={'w','x','y','z'};
		hashMap.put(1, zero);
		hashMap.put(2, one);
		hashMap.put(3, two);
		hashMap.put(4, three);
		hashMap.put(5, four);
		hashMap.put(6, five);
		hashMap.put(7, six);
		hashMap.put(8, seven);
		hashMap.put(9, eight);
		words("",number,0,hashMap);
		
	}

}

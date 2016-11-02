
package smapleQuestionsAlgorithms;

public class CominationsString {
	
	public void generateCombinations(char[] s,int i,String combi){
		if(i==s.length){
			System.out.println(combi);
		}else{
			generateCombinations(s,i+1,combi+Character.toString(s[i]));
			generateCombinations(s,i+1,combi);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AABC";
		CominationsString cs=new CominationsString();
		cs.generateCombinations(s.toCharArray(),0,"");
	}

}

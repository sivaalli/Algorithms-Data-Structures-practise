package smapleQuestionsAlgorithms;

public class StringCompression {
	
	public String compressString(String str){
		String newString="";
		char prev=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==prev){
				count++;
			}else{
				newString = newString + prev + Integer.toString(count);
				prev=str.charAt(i);
				count=1;
			}
		}
		newString = newString + prev + Integer.toString(count);
		if(newString.length()>str.length()){
			return str;
		}else return newString;
	}

	public static void main(String[] args) {
		String str="aabccccaaa";
		StringCompression obj=new StringCompression();
		System.out.println(obj.compressString(str));

	}

}

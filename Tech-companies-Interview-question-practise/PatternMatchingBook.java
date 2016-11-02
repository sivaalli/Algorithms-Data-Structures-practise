package smapleQuestionsAlgorithms;

public class PatternMatchingBook {
	
	public static int countMatch(String ptr,String mainString){
		int j=0;
		int count=0;
		for(int i=ptr.length();i<=mainString.length()-ptr.length()+1;i++){
			if(mainString.substring(j++, i).equals(ptr)){
				count++;
			}
		}
		return count;
	}
	
	public static String wordOne(String str,String pattern){
		//count no. of first letter in whole pattern..here no os a's in aabab
		int count=0;
		for(int i=1;i<pattern.length();i++){
			if(pattern.charAt(0)==pattern.charAt(i)){
				count++;
			}
		}
		
		for(int i=1;i<str.length();i++){
			if(countMatch(str.substring(0, i),str)<count){
				return str.substring(0, i-1);
			}
		}
		return "";//pattern!=given string
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="catcatgocatgo";
		String pattern="ab";
		int countB=0;
		//find no. of b's
		for(int i=0;i<pattern.length();i++){
			if(pattern.charAt(i)=='b'){
				countB++;
			}
		}
		String word1=wordOne(str,pattern);
		String copyOfString=str.substring(0);
		String word2=copyOfString.replaceAll(word1, "");//gogo
		word2=word2.substring(0, word2.length()/countB);
		str=str.replaceAll(word1, String.valueOf(pattern.charAt(0)));
		str=str.replaceAll(word2, "b");
		System.out.println(word1);
		System.out.println(word2);
		if(str.equals(pattern)){
			System.out.println("matches");
		}else
			System.out.println("doesnot match");
	}

}

package smapleQuestionsAlgorithms;

public class reverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like this program very much";
		int count=0;
		//easiest way
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count++;
			}
		}
		String[] sArray=new String[count+1];
		sArray=s.split(" ");
		for(int i=sArray.length-1;i>=0;i--){
			System.out.print(sArray[i]+ " ");
		}
		
	}

}

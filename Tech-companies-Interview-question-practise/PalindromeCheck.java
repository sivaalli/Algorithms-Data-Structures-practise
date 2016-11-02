package smapleQuestionsAlgorithms;

public class PalindromeCheck {
	
	public static boolean check(String s){
		int front=0;
		char f = 0;
		char b = 0;
		int back=s.length()-1;
		while(front<=back){
			if(Character.toLowerCase(s.charAt(front))>='a'&&Character.toLowerCase(s.charAt(front))<='z'){
				f=s.charAt(front++);
			}else{
				front++;
				continue;
			}
			if(Character.toLowerCase(s.charAt(back))>='a'&&Character.toLowerCase(s.charAt(back))<='z'){
				b=s.charAt(back--);
			}else{
				back--;
				continue;
			}
			if(f!=b){
				System.out.println(f);
				System.out.println(b);
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(check("A man, a plan, a canal, Panama.")){
			System.out.println("palindrome");
		}else
			System.out.println("not a palindrome");
	}

}

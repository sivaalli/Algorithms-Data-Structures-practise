package smapleQuestionsAlgorithms;

public class MaximumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1111";
		int k=2;
		boolean palindrome=true;
		if(k%2==0){
			for(int i=0,j=s1.length()-1;i<s1.length()/2&&k>0;i++,j--){
				if(s1.charAt(i)!=s1.charAt(j)){
					s1=s1.substring(0,i)+"9"+s1.substring(i+1,j)+"9"+s1.substring(j+1,s1.length());
					k=k-2;
					palindrome=false;
				}
			}
			if(palindrome){
				for(int i=0,j=s1.length()-1;i<s1.length()/2&&k>0;i++,j--){
						s1=s1.substring(0,i)+"9"+s1.substring(i+1,j)+"9"+s1.substring(j+1,s1.length());
						k=k-2;
						palindrome=false;
					
				}
			}
			}
		else{
		
			for(int i=0,j=s1.length()-1;i<s1.length()/2&&k>0;i++,j--){

				if(s1.charAt(i)>s1.charAt(j)){
					s1=s1.substring(0,j)+s1.charAt(i)+s1.substring(j+1,s1.length());
					k--;
				}
				else if(s1.charAt(i)<s1.charAt(j)){
					System.out.println(s1.charAt(j));
					s1=s1.substring(0,i)+s1.charAt(j)+s1.substring(i+1,s1.length());
					k--;
				}
			}	
		}
		System.out.println(s1);

		
	}

}

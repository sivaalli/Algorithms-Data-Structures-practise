package recurssion_dynamicProgramming;

public class LongestPalindromicSubSeq {
	
	public static int max(int a,int b){
		return (a>b)? a:b;	
	}
	
	public static int LPSS(String s,int i,int j){
		if(i==s.length()||j==-1){
			return 0;
		}
		if(s.charAt(i)==s.charAt(j)){
			return 1+LPSS(s,i+1,j-1);
		}
		return max(LPSS(s,i+1,j),LPSS(s,i,j-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="GEEKSFORGEEKS";
		System.out.println(LPSS(s1,0,s1.length()-1));
	}

}

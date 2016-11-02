package recurssion_dynamicProgramming;

public class LCS {
	public static int max(int a, int b){
		if(a>b){
			return a;
		}
		else 
			return b;
	}
	public static int longestCS(String s1,String s2,int i,int j){
		if(i<0||j<0){
			return 0;
		}
		if(s1.charAt(i)==s2.charAt(j)){
			return 1+longestCS(s1,s2,i-1,j-1);
		}
		
		return max(longestCS(s1,s2,i,j-1),longestCS(s1,s2,i-1,j));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDGH";
		String s2="AEDFHR";
		System.out.println(longestCS(s1,s2,s1.length()-1,s2.length()-1));
	}

}

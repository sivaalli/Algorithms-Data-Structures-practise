package recurssion_dynamicProgramming;

public class EditDistance {
	
	public static int min(int a, int b, int c){
		if(a<b && a<c){
			return a;
		}
		else if(b<a&&b<c){
			return b;
		}
		else
			return c;
	}
	
	public static int editDistance(String str1,String str2,int i,int j){
		  // If first string is empty, the only option is to
	    // insert all characters of second string into first
		if(i==-1){
			return j+1;
		}
		// If second string is empty, the only option is to
	    // remove all characters of first string
		if(j==-1){
			return i+1;
		}
		if(str1.charAt(i)==str2.charAt(j)){
			return editDistance(str1, str2, i-1,j-1);
		}
		return 1+min(editDistance(str1,str2,i-1,j),editDistance(str1,str2,i,j-1),editDistance(str1,str2,i-1,j-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="sunday";
		String str2="saturday";
		System.out.println(editDistance(str1,str2,str1.length()-1,str2.length()-1));
	}

}

package smapleQuestionsAlgorithms;

public class PermutationsString {
	
	public static String swap(String s,int l,int r){
		//best way to swap is using char[]
	char[] a=s.toCharArray();
	char dummy;
	dummy=a[l];
	a[l]=a[r];
	a[r]=dummy;
	//the below commented code wont work because it prints the address of a
	//s=a.toString();
	s=String.copyValueOf(a);
	return s;
	}
	
	public static void printSubString(String s,int l,int r){
		if(l==r){
			System.out.println(s);
		}
		//System.out.println("calling on "+s);
		for(int j=l;j<=r;j++){
			printSubString(swap(s,l,j),l+1,r);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		
		printSubString(s,0,s.length()-1);
		System.out.println(s);
		
		
	}

}

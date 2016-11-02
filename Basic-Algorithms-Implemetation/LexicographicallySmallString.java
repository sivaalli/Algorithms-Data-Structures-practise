package algorithms;
import java.util.Scanner;

public class LexicographicallySmallString {
	
	public static String reverse(String toReverse){
		if(toReverse.length()==1){
			return toReverse;
		}
		char[] dummy=new char[toReverse.length()];
		char[] dummyReverse=new char[toReverse.length()];
		dummy=toReverse.toCharArray();
		for(int i=0,j=dummy.length-1;i<dummy.length;i++,j--){
			dummyReverse[j]=dummy[i];
		}
		toReverse="";
		toReverse=String.copyValueOf(dummyReverse);
		return toReverse;			
	}
	public static double weight(String stringToWeight){
		double weight=0;
		char[] dummy=new char[stringToWeight.length()];
		dummy=stringToWeight.toCharArray();
		for(int i=0,j=dummy.length-1;i<dummy.length;i++,j--){
			if(dummy[i]=='b'){
				weight=weight+Math.pow(2, j);
			}
		}
		return weight;
	}

	public static void main(String[] args){
		String s="";
		String s1;
		double n=0.0;
		int minI=0,minJ=0;
		boolean iterationOne;
		Scanner b=new Scanner(System.in);
		int testCase=b.nextInt();
		b.nextLine();
		while(testCase>0){
			s=b.nextLine();
			iterationOne=true;
			//System.out.println(s);
			for(int i=0;i<s.length();i++){
				for(int j=i+1;j<=s.length();j++){
					//System.out.println("i="+i+"j="+j);
					s1=reverse(s.substring(i, j));
					//System.out.print(s1+"--------");
					s1=s.substring(0, i)+s1+s.substring(j,s.length());	
					//System.out.println(s1+"   "+weight(s1)+"   i="+i+"j="+j);
					//calculate weight of string.by giving a=0 and b=1; ex:abab=0101;
					if(iterationOne){
						n=weight(s1);
						minI=i;
						minJ=j-1;
					}
					else if(weight(s1)<n){
						n=weight(s1);
						minI=i;
						minJ=j-1;
					}
					iterationOne=false;
				}
			}
			testCase--;
			System.out.println(minI+" "+minJ);
		}
		
		
		
	}
}

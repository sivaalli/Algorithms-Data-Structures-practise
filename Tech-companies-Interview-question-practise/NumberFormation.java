package smapleQuestionsAlgorithms;

import java.util.Scanner;

public class NumberFormation {
	
	public static double formNumbers(int x,int y,int z,String num,int len){
		if(num.length()==len){
			return 0;
		}
		else{
			double result=0;
			if(x>0){
				result+= Double.parseDouble(4+num) +formNumbers(x-1,y,z,4+num,len);
			}
			if(y>0){
				result+= Double.parseDouble(5+num)+formNumbers(x,y-1,z,5+num,len);
			}
			if(z>0){
				result+=Double.parseDouble(6+num)+formNumbers(x,y,z-1,6+num,len);
			}
			//result+=formNumbers(x,y,z,0+num,len);
			return result%(7+Math.pow(10, 9));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		while(n>0){
			n--;
			int x=in.nextInt();
			int y=in.nextInt();
			int z=in.nextInt();
			//System.out.println(x+" "+y+" "+z);
			System.out.println((int)formNumbers(x, y, z, "", x+y+z));
		}
		in.close();
		
	}

}

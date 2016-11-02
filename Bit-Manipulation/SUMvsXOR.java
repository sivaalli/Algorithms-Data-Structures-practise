package bitManipulations;

import java.util.Scanner;

public class SUMvsXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		long n=in.nextLong();
		in.close();
		int position=0;
		for(int i=64;i>=0;i--){
			System.out.println((n & (1<<i)));
			if((n & (1<<i))!=0 ){
				position=Math.abs(i-32);
				break;
			}
		}
		System.out.println(position);
		int count=0;
		for(int i=0;i<=64;i++){
			if((n & (1<<i))==0){
				count++;
			}
		}
		System.out.println((long)Math.pow(2, count));
		}
}

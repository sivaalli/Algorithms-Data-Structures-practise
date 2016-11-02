package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class FibonacciSeries {
	
	
	public static int series(int n){
	int x=0;
	int y=1;
	if(n==0){
		System.out.println("0");
	}else if(n==1){
		System.out.println("1");
	}
	int result = 0;
	for(int i=2;i<n;i++){
		result=x+y;
		
		x=y;
		y=result;
	}
	return result;
	}
	public static void main(String[] args){
		System.out.println(series(10));
	}
}

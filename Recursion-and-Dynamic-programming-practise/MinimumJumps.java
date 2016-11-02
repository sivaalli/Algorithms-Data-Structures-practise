package recurssion_dynamicProgramming;

public class MinimumJumps {
	
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
	
/*	public static int minJumps(int jumps,int initial){
		if(initial==jumps){
			return 0;
		}
		if(initial>jumps||initial<0){
			return Integer.MAX_VALUE;
		}
			return 1+min(minJumps(jumps,initial+1),minJumps(jumps,initial),minJumps(jumps,initial-1));
		
	}*/
	public static int minJumps(int jumps,int initial,int count){
		if(initial==jumps){
			return count;
		}
		if(initial>jumps||initial<0){
			return Integer.MAX_VALUE;
		}
		if(count>jumps){
			return Integer.MAX_VALUE;
		}
			return min(minJumps(jumps,initial+1,count+1),minJumps(jumps,initial,count+1),minJumps(jumps,initial-1,count+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		//4,0,0
		System.out.println(minJumps(5,0,0));
	}

}

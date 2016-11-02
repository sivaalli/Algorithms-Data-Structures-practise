package recurssion_dynamicProgramming;

public class MaxBitCount {
	
	public static int count(String s,int i, int count, boolean conti){
		if(i==s.length()){
			//System.out.println(count);
			return count;		
		}
		if(s.charAt(i)=='1'){
			return count(s,i+1,count+1,conti);
		}
		else{
			//either assume that i th bit is one and proceed by changinf conti to false or just set i to length 
			//so recursion ends
			if(conti){
				//countinue and make countinue false;
				return Math.max(count(s,i+1,count+1,false),count(s,i+1,0,conti));
			}else{
				//System.out.println(count);
				return count;
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1775;
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		System.out.println(count(s,0,0,true));
	}

}

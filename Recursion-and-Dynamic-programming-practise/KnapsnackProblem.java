package recurssion_dynamicProgramming;
//understand code every part..draw recurssion tree.
public class KnapsnackProblem {
	
	public static int max(int a,int b){
		return (a>b)? a:b;
		
	}
	
	public static int  problem(int[] val,int[] weig,int w,int i,int calWei,int calVal){
		if(calWei>w){//if anytime calculated weight is more than weight allowed then return 0
			return 0;
			}
		if(i==-1){//if traversing throught all elements completed then return calculated value.
			//note this statement will be executed if only calWei<w.
			//at anytime calculated weight is more than weight allowed then return 0
			return calVal;
		}
		return max(problem(val,weig,w,i-1,calWei+weig[i],calVal+val[i]),problem(val,weig,w,i-1,calWei,calVal));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val={60,100,120};
		int[] weig={10,20,30};
		System.out.println((problem(val,weig,50,val.length-1,0,0)));
		

	}

}

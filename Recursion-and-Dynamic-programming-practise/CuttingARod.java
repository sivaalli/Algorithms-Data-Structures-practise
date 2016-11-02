package recurssion_dynamicProgramming;

public class CuttingARod {
	public static int max(int a,int b){
		return (a>b)? a:b;	
	}
	
	public static int maxPrice(int[] len,int[] cost,int totLen,int i,int totCost){
		if(totLen==0){
			return totCost;
		}
		if(i==-1){
			return 0;
		}
		if(totLen<len[i]){
			return maxPrice(len,cost,totLen,i-1,totCost);
		}
		else
			return max(maxPrice(len,cost,totLen-len[i],i,totCost+cost[i]),maxPrice(len,cost,totLen,i-1,totCost));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] len={1,2,3,4,5,6,7,8};
		int[] cost={1,5,8,9,10,17,17,20};
		System.out.println(maxPrice(len,cost,8,len.length-1,0));
	}

}

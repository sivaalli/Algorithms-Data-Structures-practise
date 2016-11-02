package recurssion_dynamicProgramming;
//a very good recurssion..please study this for revising recurssion
public class MinCostOfRopes {
	
	public static int[] swap(int[] arr,int l, int r){
		int dummy=0;
		dummy=arr[l];
		arr[l]=arr[r];
		arr[r]=dummy;
		return arr;
	}
	
	public static int allCombinations(int[] arr, int l, int r){
		int min=Integer.MAX_VALUE;
		int value=0;
		int cost=0;
		int sum=0;
		//when l==r then return the cost for that array
		if(l==r){
			for(int j=0;j<arr.length-1;j++){
				sum=0;
				for(int k=0;k<=j+1;k++){
					sum=sum+arr[k];
				}
				//System.out.println(cost);
				cost=cost+sum;
			}
			System.out.print("array-->");
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+" ");
			}
			//System.out.println("-----"+cost);
			System.out.print(cost+"  ");
			System.out.println();
			return cost;
		}else{
//if l!=r then return minimum cost for all permutations of array;;
			for(int j=l;j<=r;j++){
				value=allCombinations(swap(arr,l,j),l+1,r);
				if(value<min){
					min=value;
				}
			}
			return min;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,2,6};
		System.out.println(allCombinations(arr,0,arr.length-1));
	}

}

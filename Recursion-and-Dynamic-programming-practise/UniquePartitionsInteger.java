package recurssion_dynamicProgramming;

public class UniquePartitionsInteger {
	
	public static int sum(int[] arr){
		int total=0;
		for(int i=0;i<arr.length;i++){
			total=total+arr[i];
		}
		return total;
	}

	public static void partitionInteger(int n,int[] arr,int i){
		if(sum(arr)==n){
			//print the array;
			for(int j=0;j<i;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		if(sum(arr)<n){
			for(int j=arr[i-1];j>0;j--){
				arr[i]=j;
				partitionInteger(n,arr,i+1);
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] arr=new int[n];
		for(int i=n;i>0;i--){
			arr[0]=i;
			partitionInteger(n,arr,1);
		}
			
		
	}

}

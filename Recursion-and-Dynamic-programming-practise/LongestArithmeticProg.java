package recurssion_dynamicProgramming;


	
	public class LongestArithmeticProg {
		
		public static int max(int a,int b){
			return (a>b)? a:b;	
		}
		
		public static int lap(int[] arr,int[] a,int i, int j){
			if(i==arr.length){
				int count=2;
				int diff=arr[1]-arr[0];
				for(int k=1;k<a.length-1;k++){
					if(a[k+1]-a[k]==diff){
						count++;
					}
				}
				for(int k=0;k<a.length;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println("----"+count);
				System.out.println();
				return count;
			}
			int[] local=new int[a.length];
			for(int k=0;k<a.length;k++){
				local[k]=a[k];
			}
			local[j]=arr[i];
			return max(lap(arr,local,i+1,j+1),lap(arr,a,i+1,j));
		}
			
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr={1,7,10,13,14,19};
			int[] a=new int[arr.length];
			System.out.println(lap(arr,a,0,0));
		}

	}


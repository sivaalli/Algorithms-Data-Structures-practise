package algorithms;
//https://www.youtube.com/watch?v=sfmaf4QpVTw
public class MergeSort {
	public static int[] arr={30,20,40,50,1,5,6,9,10,11,21};
	public static void merge(int p,int q,int r){	
		System.out.println("-----------");
		System.out.println("p="+p+"  "+"q="+q+"  "+"r="+r);
		int n1=q-p+2;
		int n2=r-q+1;
		int L[]=new int[n1];
		int R[]=new int[n2];
		System.out.println(n1);
		System.out.println(n2);
		L[L.length-1]=Integer.MAX_VALUE;
		R[R.length-1]=Integer.MAX_VALUE;
		for(int i=0,j=p;j<=q;i++,j++){
			L[i]=arr[j];
		}
		for(int i=0,j=q+1;j<=r;i++,j++){
			R[i]=arr[j];
		}
		int i=0,j=0;

		for(int k=p;k<r+1;k++){
			if(L[i]<R[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
			System.out.println(arr[k]);

		}
	}
	public static void mergeSort(int p,int r){
		if(p<r){
			mergeSort(p,(p+r)/2);
			mergeSort((p+r)/2+1,r);
			merge(p,(p+r)/2,r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeSort(0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}

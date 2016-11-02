package algorithms;
//for explanation watch https://www.youtube.com/watch?v=3DV8GO9g7B4
public class QuickSort {
	static int[] a={6,5,8,7,5,2,6,3,6};
	static int partition(int p, int r){
		int pivot=a[r];
		int i=p-1;
		int buffer;
		for(int j=p;j<r;j++){
			if(a[j]<=pivot){
				i=i+1;
				//exchange a[i] and a[j]
				buffer=a[i];
				a[i]=a[j];
				a[j]=buffer;
			}
		}
		//exchange a[i+1] and a[r]
		a[r]=a[i+1];
		a[i+1]=pivot;
		return i+1;
	}
	static void quickSort(int p,int r){
		int q;
		if(p<r){
			q=partition(p,r);			
			quickSort(p, q-1);
			quickSort(q+1,r);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		quickSort(0,a.length-1);
		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+",");
		}
	}

}

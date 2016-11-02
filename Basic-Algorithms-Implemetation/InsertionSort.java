package algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={12,1,66,8,99,44,0,5};
		int key;
		for(int i=1;i<array.length;i++){
			key=array[i];
			for(int j=i-1;j>=0 && array[j]>key;j--){
				array[j+1]=array[j];
				//array[j+1]=array[j];
				array[j]=key;
			}
			for(int m=0;m<array.length;m++){
				System.out.print(array[m]+",");
			}
			System.out.println();
			
		}
		
	}
	

}

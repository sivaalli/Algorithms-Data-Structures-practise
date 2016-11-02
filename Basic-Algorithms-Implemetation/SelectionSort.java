package algorithms;

public class SelectionSort {
	

	public static void main(String[] args){
		int[] array={22,1,4,66,4,26,7,86,3,2,5};
		int min,temp;
		for(int i=0;i<array.length-1;i++){
			min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[min]>array[j]){
					min=j;
				}
			}
			//System.out.println(min);
			//swap minIndex and current i
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
	}
	
}

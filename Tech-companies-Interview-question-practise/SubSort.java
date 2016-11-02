package smapleQuestionsAlgorithms;

public class SubSort {
	
	public void sort(int[] arr){
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		int i=0,j=arr.length-1;
		for(;i<arr.length/2;i++,j--){
			if(arr[i]>min && arr[j]<max && arr[i]<arr[j]){
				min=arr[i];
				max=arr[j];
			}else{
				break;
			}
		}
		System.out.print(i+" "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,4,7,10,11,8,12,5,6,16,18,19
				};
		new SubSort().sort(arr);
	}

}

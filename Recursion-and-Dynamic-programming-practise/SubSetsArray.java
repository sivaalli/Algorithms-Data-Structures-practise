package recurssion_dynamicProgramming;

import java.util.ArrayList;

public class SubSetsArray {
	
	public void printArrays(int[] arr,int[] subArray,int i,int j){
		if(i==arr.length){
			for(int m=0;m<j;m++){
				System.out.print(subArray[m]+" , ");
			}
			System.out.println();
		}else{
			printArrays(arr,subArray,i+1,j);
			subArray[j]=arr[i];
			printArrays(arr,subArray,i+1,j+1);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2};
		int[] subArray=new int[arr.length];
		new SubSetsArray().printArrays(arr, subArray, 0,0);
	}

}

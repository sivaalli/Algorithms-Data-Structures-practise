package smapleQuestionsAlgorithms;

public class MinJumps {
	
	public static int minJumps(int i,int[] arr,int len){
		if(i==len-1){
			System.out.println("asdasd");
			return 0;
		}
		if(i>=len || arr[i]==0){
			return 999;
		}
		int min=999;
		for(int j=i+1;j<=arr[i];j++){
			min=Math.min(min, 1+minJumps(i+j,arr,len));
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,5,8,9,2,6,7,6,8,9};
		System.out.println(minJumps(0, arr, arr.length));
	}

}

package smapleQuestionsAlgorithms;

public class DistinctPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,1,1,2};
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}

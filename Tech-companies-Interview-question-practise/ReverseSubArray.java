package smapleQuestionsAlgorithms;

public class ReverseSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8};
		int l=2;
		int r=4;
		int dummy;
		for(int i=l-1,j=r-1;i<l+(r-l)/2;i++,j--){
			//swap i and j position;
			System.out.println("hi");
			dummy=arr[i];
			arr[i]=arr[j];
			arr[j]=dummy;
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}

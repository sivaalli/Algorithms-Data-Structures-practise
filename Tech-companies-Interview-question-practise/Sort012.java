package smapleQuestionsAlgorithms;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};
		int dummy;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					dummy=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=dummy;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}

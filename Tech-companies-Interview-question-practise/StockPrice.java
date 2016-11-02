package smapleQuestionsAlgorithms;

public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={100,180,260,301,40,535,695,40,200};
		int i=0,j=1;
		for(j=1;j<arr.length-1;j++){
			if(arr[j+1]>arr[j]){
			}
			else{
				System.out.println("buy at day "+i+" sell at day "+j);
				i=j+1;
			}
		}
		if(i!=j){
			//to print the last.
			System.out.println("buy at day "+i+" sell at day "+j);
		}
		
	}

}

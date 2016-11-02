package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=473
public class IndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={15,2,45,12,7};
		for(int i=0;i<arr.length;i++){
			if(arr[i]==i+1){
				System.out.println(i+1);
			}
		}
	}

}

package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=558
public class InversionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]={2,4,1,3,5};
		int count=0;
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					count=++count;
				}
			}
		}
		System.out.println(count);
	}

}

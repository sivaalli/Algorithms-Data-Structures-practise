package smapleQuestionsAlgorithms;
//dynamic programming....very Imp
public class CoverADistanceSteps {

	public int distance(int n){
		if(n==0){
			return 1;
		}
		if(n<0){
			return 0;
		}
		return distance(n-1)+distance(n-2)+distance(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new CoverADistanceSteps().distance(5));
		
	}

}

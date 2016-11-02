package smapleQuestionsAlgorithms;

public class DividingBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=10;
		int shorter = 3;
		int longer = 5;
		int noOfShorter = k;
		int noOfLonger = 0;
		//(shorter*noOfShorter--)+(longer*noOfLonger++)
		for(int i=0;i<k;i++){
			System.out.print((shorter*noOfShorter--)+(longer*noOfLonger++));
			System.out.print(" ");
		}
	}

}

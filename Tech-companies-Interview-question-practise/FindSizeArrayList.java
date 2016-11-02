package smapleQuestionsAlgorithms;
//www.geeksforgeeks.org/amazon-interview-experience-set-280-on-campus-for-internship/
import java.util.ArrayList;

class ABC {
	int n;
	private int[] arr;
 
	ABC(int n) {
		arr=new int[n];
	}
 
	public int getItem(int index) {
		return arr[index];
	}
}
public class FindSizeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a = new ABC(5);
		for(int i=0;i<Integer.MAX_VALUE;i++){
			try {
				System.out.println(a.getItem(i));
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(i);
				break;
			}
		}
	}

}

package smapleQuestionsAlgorithms;

import java.util.Arrays;

public class FacebookQuestion {

	public static int hoursWatched(int[] in,int[] out){
		int count=0;
		int i=0,j=0;
		int watchedHours=0;
		for(int h=0;h<=24;h++){
			while( i<in.length && in[i]==h ){
				i++;
				count++;
			}
			while(j<out.length && out[j]==h ){
				j++;
				count--;
			}
			if(count>0){
				watchedHours++;
			}
		}
		return watchedHours;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in={1,6,2,7,10};
		int[] out={4,8,4,9,15};
		Arrays.sort(in);
		Arrays.sort(out);
		System.out.println(hoursWatched(in, out));
	}

}

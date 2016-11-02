package smapleQuestionsAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class RandomDeckCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards=new int[52];
		int pointer=cards.length-1;
		for(int i=0;i<cards.length;i++){
			cards[i]=i+1;
		}
		while(pointer>0){
			int random=(int)(Math.random()*(pointer+1));
			System.out.print(cards[random]+" ");
			int dummy=cards[random];
			cards[random]=cards[pointer];
			cards[pointer]=dummy;
			pointer--;
		}
	}

}

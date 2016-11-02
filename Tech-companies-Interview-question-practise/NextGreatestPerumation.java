package smapleQuestionsAlgorithms;

public class NextGreatestPerumation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=4321;
	String numString=Integer.toString(num);
	char[] toBeSorted=numString.toCharArray();
	char[] numArray=numString.toCharArray();
	int maxIndex=0;
	//check if the given number has no next permutation
	boolean nextPermu=false;
	for(int i=0;i<numArray.length-1;i++){
		if(numArray[i]<numArray[i+1]){
			nextPermu=true;
		}
	}
	if(!nextPermu){
		System.out.println("not next permutation possible");
		return;
	}

	
	for(int i=0;i<numArray.length;i++){
		if(numArray[i]>numArray[maxIndex]){
			maxIndex=i;
		}
	}
	java.util.Arrays.sort(toBeSorted);
	if(String.copyValueOf(toBeSorted).equals(numString)){
		//swap last 2 indexes
		char temp=numArray[numArray.length-1];
		numArray[numArray.length-1]=numArray[numArray.length-2];
		numArray[numArray.length-2]=temp;
		System.out.println(String.copyValueOf(numArray));
		return;
	}
	
	java.util.Arrays.sort(numArray, maxIndex, numArray.length);
	System.out.println(String.copyValueOf(numArray));
	//swap maxIndex and maxIndex-1;
	char temp=numArray[maxIndex];
	numArray[maxIndex]=numArray[maxIndex-1];
	numArray[maxIndex-1]=temp;
	}

}

package smapleQuestionsAlgorithms;

public class PrintAnagrams {
	
	public boolean isAnagram(char[] string1,char[] string2){
		java.util.Arrays.sort(string1);
		java.util.Arrays.sort(string2);
		if(new String(string1).equals(new String(string2))){
			return true;
		}
		else return false;
	}
	
	public void printAnagrams(String[] listOfAnagrams){
		for(int i=0;i<listOfAnagrams.length;i++){
			if(listOfAnagrams[i]==" "){
				continue;
			}
			System.out.print(listOfAnagrams[i]+" ");
			for(int j=i+1;j<listOfAnagrams.length;j++){
				if(listOfAnagrams[j]==" "){
					continue;
				}
				if(isAnagram(listOfAnagrams[i].toCharArray(),listOfAnagrams[j].toCharArray())){
					System.out.print(listOfAnagrams[j]+" ");
					listOfAnagrams[j]=" ";
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] anagrams={"cat","act","pat","mad","dog","god"};
		PrintAnagrams pa=new PrintAnagrams();
		pa.printAnagrams(anagrams);
	}

}

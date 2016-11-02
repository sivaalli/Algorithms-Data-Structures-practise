package smapleQuestionsAlgorithms;

public class SubSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,5,11};
		int i=0,j=arr.length-1;
		int sumFront=arr[i],sumBack=arr[arr.length-1];
		while(j-i!=1){
			if(sumFront<sumBack){
				i++;
				sumFront=sumFront+arr[i];
				System.out.println("i incremented");
			}
			else if(sumFront>sumBack){
				j--;
				System.out.println("j decremeneted");
				sumBack=sumBack+arr[j];
			}
			if(sumFront==sumBack){
				System.out.println("equal");
				break;
			}	
			}
		}
	}



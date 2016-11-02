package algorithms;
public class BubbleSort {
public static void main(String[] args){
	
	int[] myArray = {11,22,33,44,66,55,88,77,99};
	int temp;
	boolean swap=false;
	for(int i=0;i<myArray.length-1;i++){
		swap=false;
								for(int j=0;j<myArray.length-1-i;j++){
									if(myArray[j]>myArray[j+1]){
										swap=true;
										temp=myArray[j+1];
										myArray[j+1]=myArray[j];
										myArray[j]=temp;  
									}		
								}
		System.out.println("swap="+swap);
		if(!swap){
			break;
		}
		
		for(int k=0;k<myArray.length;k++){
			System.out.print(myArray[k]+",");	
		}
		System.out.println();
			
	}
	for(int k=0;k<myArray.length;k++){
		System.out.print(myArray[k]+":");		
	}
}
}

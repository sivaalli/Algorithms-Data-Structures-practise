package algorithms;

public class RemoveDuplicateSelfAlgo {
	static int[] array={32,24,32,9,24,13,41,9,41,41,13,9,12,41,12,13};
	static int counter=0;
	public static void removeNegativeOne(){
		for(int i=0;i<array.length;i++){
			if(array[i]==-1){
				for(int j=i;j<array.length-1;j++){
					array[j]=array[j+1];
				}
				array[array.length-1]=0;
				for(int k=0;k<array.length;k++){
					System.out.print(array[k]+",");
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args){
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					//duplicate detected. Replace array value to -1 to 
					//remove all indexes with -1 value later
					array[j]=-1;
					
					//System.out.println("array["+j+"]"+array[j]);
				}
			}
		}
		for(int i=0;i<array.length;i++){
			if(array[i]==-1){
				counter++;
			}	
		}
		while(counter!=0){
			removeNegativeOne();
			System.out.println("-----------------------------------------------");
			counter--;
		}
		
		
		System.out.println();
		//process array to remove indexes having value of -1
		
		
	}
}

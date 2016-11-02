package smapleQuestionsAlgorithms;
//ola interview question
public class MaxDiffTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] arr={2, 3, 10, 6, 4, 8, 1};
			int maxDiff=0,diff=0;
			int maxI=0,maxJ=0;	
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					diff=arr[j]-arr[i];
					if(diff>0){
						if(diff>maxDiff){
							maxI=i;
							maxJ=j;
							maxDiff=diff;
							
						}
					}
				 }
				 
				
			}
			System.out.println("maximum Difference="+maxDiff+"and occcurs between "+maxI+" and "+maxJ);
	}

}

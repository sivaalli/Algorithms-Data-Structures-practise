package algorithms;
//google interview question.http://www.practice.geeksforgeeks.org/problem-page.php?pid=129
public class MaximunIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,5,4,2};
		int maxIndex=0,count;
		for(int i=0;i<a.length-1;i++){
			//System.out.println(i);
			count=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<=a[j]){
					count++;
				}
				else break;
				
			}
			if(count>maxIndex){
				maxIndex=count;
			}
		}
		System.out.println(maxIndex);
		
	}

}

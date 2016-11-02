package algorithms;
//google interview question..tricky..
public class SubArraySum {
	public static void main(String[] args){

		int a[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int findSum=12;
		for(int i=0;i<a.length;i++){
			sum=0;
			for(int j=i;sum<findSum&&j<a.length;j++){
				sum=sum+a[j];
				if(sum==findSum){
					System.out.println(i+","+j);
				}
			}
		}
		
		
}
}

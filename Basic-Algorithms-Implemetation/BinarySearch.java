package algorithms;
//Binary search is a fast search algorithm with run-time complexity of Ο(log n). 
//This search algorithm works on the principle of divide and conquer. 
//For this algorithm to work properly the data collection should be in sorted form.
public class BinarySearch {
	static int[] arr={1,2,3,4,5,6,7,8};
	static int low=0,mid,high=arr.length-1,cnt=0;
	
	public static int search(int num){
		mid=low+(high-low)/2;
		while(low!=high){
			cnt++;
			if(arr[mid]==num){
				return mid;
				
			}
			else if(num>arr[mid]){
				low=mid+1;
				mid=low+(high-low)/2;
			}
			else{
				high=mid-1;
				mid=low+(high-low)/2;
			}
			
		}
		return mid;
		
	}
	
	public static void main(String args[]){
		int num=search(1);
		System.out.println("element found at index "+num);
		System.out.println("while loop executed "+cnt);
	}
}

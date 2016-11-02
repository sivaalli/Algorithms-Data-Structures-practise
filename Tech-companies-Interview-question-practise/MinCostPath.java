package smapleQuestionsAlgorithms;
//http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
public class MinCostPath {
	
	static int arr[][]={{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3} };
	public static int min(int a, int b, int c){
		if(a<b&&a<c){
			return a;
		}
		else if(b<a&&b<c){
			return b;
		}
		else 
			return c;
	}
	public static int minCost(int i,int j){
		if(i<0||j<0){
			return Integer.MAX_VALUE;
		}
		else if(i==0&&j==0){
			return arr[0][0];
		}
		return arr[i][j]+min(minCost(i-1,j-1),minCost(i,j-1),minCost(i-1,j));
		
	}
	
	public static void main(String[] args){
		
		
	System.out.println(minCost(2,2));	
	}
}

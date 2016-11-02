package smapleQuestionsAlgorithms;

import java.util.Scanner;

//http://www.practice.geeksforgeeks.org/problem-page.php?pid=91
public class MinPointsDestination {

	public static int calculate(int [][]arr,int rows,int cols){
		for(int i=1;i<cols;i++){
			arr[0][i]+=arr[0][i-1];
			//System.out.println(arr[0][i]);
		}
		for(int i=1;i<rows;i++){
			arr[i][0]+=arr[i-1][0];
			//System.out.println(arr[i][0]);
		}
		for(int i=1;i<rows;i++){
			for(int j=1;j<cols;j++){
				int num = 0;
				if(arr[i-1][j]<0 && arr[i][j-1]<0){
					num=Math.max(arr[i-1][j], arr[i][j-1]);
				}else if(arr[i-1][j]<0 && arr[i][j-1]>0){
					num=arr[i-1][j];
				}else if(arr[i-1][j]>0 && arr[i][j-1]<0){
					num=arr[i][j-1];
				}else if(arr[i-1][j]>0 && arr[i][j-1]>0){
					num=Math.min(arr[i-1][j], arr[i][j-1]);
				}
				arr[i][j]+=num;
				//System.out.print(arr[i][j]+" ");
			}
		}
		int min=arr[rows-1][cols-1];
		System.out.println(min);
		if(min<0){
			return Math.abs(min)+1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int count=in.nextInt();
		while(count>0){
			count--;
			int rows=in.nextInt();
			int cols=in.nextInt();
			int[][] arr=new int[rows][cols];
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					arr[i][j]=in.nextInt();
				}
			}
			System.out.println(calculate(arr,rows,cols));
		}
		
		in.close();
	}

}

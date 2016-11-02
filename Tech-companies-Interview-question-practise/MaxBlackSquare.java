package smapleQuestionsAlgorithms;

public class MaxBlackSquare {
	
	private int checkSquare(int[][] arr,int i,int j,int m,int n){
		if(arr[i][n]==1 && arr[m][j]==1){
			return m-i;
		}else 
			return -1;
	}
	
	public void getMaxSquare(int[][] arr){
		int min=Integer.MIN_VALUE;
		int starti=0,startj=0,endi=0,endj=0;
		int area=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==1){
					for(int m=i+1,n=j+1;m<arr.length&&n<arr.length;m++,n++){
						if(arr[m][n]==1){
							area=checkSquare(arr,i,j,m,n);
							if(area!=-1 && area>min){
								min=area;
								starti=i;
								startj=j;
								endi=m;
								endj=n;
							}
						}
					}
				}
			}
		}
		System.out.println(starti+" "+startj+" "+endi+" "+endj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,0,0,1},
					{1,0,0,0},
					{1,1,1,0},
					{1,1,1,1}};
		new MaxBlackSquare().getMaxSquare(arr);
		
	}

}

package recurssion_dynamicProgramming;

public class NoOfSteps {
	
	public int NSteps(int n){
		int[] arr=new int[n];
		arr[0]=1;
		arr[1]=1+arr[0];
		arr[2]=1+arr[1]+arr[0];
		for(int i=3;i<arr.length;i++){
				arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
		}
		return arr[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new NoOfSteps().NSteps(5));
	}

}

package recurssion_dynamicProgramming;

public class NoOfDecodings {
	
	public int decodings(String str,int i){
		if(i<=-2){
			return 0;
		}
		int withOneDigit=0;
		int withTwoDigits=0;
		if(i==-1){
			System.out.println("ins");
			return 1;
		}if(i>1){
			if(str.charAt(i)>'0'){
				withOneDigit= decodings(str,i-1);
			}
			if(str.charAt(i)>='0'&&str.charAt(i)<='7'&&str.charAt(i-1)>='0'&&str.charAt(i-1)<='2'){
				withTwoDigits=decodings(str,i-2);
			}
		
		}
			
			
		
		return withOneDigit+withTwoDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfDecodings obj=new NoOfDecodings();
		System.out.println(obj.decodings("1234",3));
	}

}

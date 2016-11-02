package smapleQuestionsAlgorithms;

public class IPAddressBuilder {
	
	public static void IPaddress(String s,String builder,int noOfDots){
		if(s.isEmpty()){
			if(noOfDots==4){
				System.out.println(builder);
				return;
			}
		}
		if(noOfDots<4){
			for(int i=1;i<=3 && i<=s.length();i++){
				String first=s.substring(0, i);
				String second=s.substring(i);
				int num=Integer.parseInt(first);
				if(num<=256){
					//builder+=first+".";
					IPaddress(second,builder+first+".",noOfDots+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPaddress("1111","",0);
		
	}

}

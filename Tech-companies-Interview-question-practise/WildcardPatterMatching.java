package smapleQuestionsAlgorithms;

public class WildcardPatterMatching {

	public static boolean match(String str, String ptr){
		if(str.equals(ptr)){
			return true;
		}
		if(str.isEmpty() && ptr.isEmpty()){
			return true;
		}
		if(str.isEmpty() || ptr.isEmpty()){
			return false;
		}
		//assuming only single * occur
			for(int i=0;i<ptr.length();i++){
				if(ptr.charAt(i)=='*'){
					for(int j=i;j<=str.length();j++){
						String first=str.substring(i, j);
						String second=str.substring(j);
						
						if(match(second,ptr.substring(1))){		
							System.out.println(first);
							return true;
						}
					}
				}
				else if(ptr.charAt(i)=='?'){
					return match(str.substring(1),ptr.substring(1));
				}else if(str.charAt(i)==ptr.charAt(i)){
					return match(str.substring(1),ptr.substring(1));
				}else{
					return false;
				}
			}
			return false;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(match("baaabab", "******ba******ab")){
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
	}

}

package recurssion_dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class WordTransormation {
	
	public static void findWords(String initial,String end,HashSet<String> set){
		if(initial.length()!=end.length()){
			System.out.println("please provide valid strings. Given strings lenght doesn't match");
		}
		if(initial.equals(end)){
			System.out.println(end);
		}else{
			if(set.contains(initial)){
				System.out.print(initial+"-->");
				for(int i=0;i<initial.length();i++){
					if(initial.charAt(i)!=end.charAt(i)){
						String inter="";
						inter=initial.substring(0,i)+end.charAt(i)+initial.substring(i+1);
						if(set.contains(inter)){
							findWords(inter,end,set);
							break;
						}
					}
				}
			}
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initial="DAMP";
		String end="LIKE";
		HashSet<String> set= new HashSet<>();
		set.add("DAMP");set.add("LAMP");set.add("LIMP");set.add("LIME");set.add("LAME");
		set.add("LIKE");set.add("LAKE");set.add("CALL");set.add("GO");set.add("HI");
		findWords(initial,end,set);
		
	}

}

package smapleQuestionsAlgorithms;
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=871
/*You are given N strings of alphabet characters and the task is to find their matching decimal representation as on the shown keypad. Output the decimal representation corresponding to the string. For ex: if you are given “amazon” then its corresponding decimal representation will be 262966.
 * */
 
public class KeypadTyping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		String type="";
		char s1='a';
		char[] charSet=s.toCharArray();
		for(int i=0;i<charSet.length;i++){
			if((charSet[i]>='a'&&charSet[i]<='c')||(charSet[i]>='A'&&charSet[i]<='C')){
				type=type+"2";
			}
			else if((charSet[i]>='d'&&charSet[i]<='f')||(charSet[i]>='D'&&charSet[i]<='F')){
				type=type+"3";
			}
			else if((charSet[i]>='g'&&charSet[i]<='i')||(charSet[i]>='G'&&charSet[i]<='I')){
				type=type+"4";
			}
			else if((charSet[i]>='j'&&charSet[i]<='l')||(charSet[i]>='J'&&charSet[i]<='L')){
				type=type+"5";
			}
			else if((charSet[i]>='m'&&charSet[i]<='o')||(charSet[i]>='M'&&charSet[i]<='O')){
				type=type+"6";
			}
			else if((charSet[i]>='p'&&charSet[i]<='s')||(charSet[i]>='P'&&charSet[i]<='S')){
				type=type+"7";
			}
			else if((charSet[i]>='t'&&charSet[i]<='v')||(charSet[i]>='T'&&charSet[i]<='V')){
				type=type+"8";
			}
			else if((charSet[i]>='w'&&charSet[i]<='z')||(charSet[i]>='W'&&charSet[i]<='Z')){
				type=type+"9";
			}
			
			
		}
		System.out.println(type);
		

	}

}

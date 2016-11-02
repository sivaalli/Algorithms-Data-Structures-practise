package smapleQuestionsAlgorithms;

import java.util.Stack;


public class ExpressionEvaluation {

	public boolean expressionEvaluation(String expr){
		Stack<Character> s=new Stack<>();
		for(int i=0;i<expr.length();i++){
			if(expr.charAt(i)==' '){
				continue;
			}
			System.out.println(expr.charAt(i));
			if(expr.charAt(i)=='('||expr.charAt(i)=='{'||expr.charAt(i)=='['){
				s.push(expr.charAt(i));
			}else{
				if(s.isEmpty()){
					return false;
					}
				char c=s.pop();
				System.out.println("c="+c);
				if(expr.charAt(i)==')'){	
					if(c!='('){					
						return false;
					
				}}else if(expr.charAt(i)=='}'){
					if(c!='{'){
						return false;
					}
				}else if(expr.charAt(i)==']'){
					if(c!='['){
						return false;
					}
				}else{
					return false;
				}	
		}	
	}
		if(!s.isEmpty()){
			return false;
		}else
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[(])";
		if(new ExpressionEvaluation().expressionEvaluation(s)){
			System.out.println("expression valid");
		}else{
			System.out.println("Expression invalid");
		}
	

}}

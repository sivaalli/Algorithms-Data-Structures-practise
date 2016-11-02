package algorithms;

import java.util.Iterator;
import java.util.Stack;

public class ExpressionEvaluation {

	public int evaluate(String expr) {
		int i=0;
		Stack<Integer> operand=new Stack<>();
		Stack<Character> operator=new Stack<>();
		Boolean alternate=false;
		int left=0,right=0;
		int result=0;
		for(i=0;i<expr.length();i++){
			if(expr.charAt(i)==' '){
				continue;
			}
			if(!alternate){
				operand.push((int)expr.charAt(i)-48);
				if((!operator.isEmpty())&&(operator.peek()=='*'||operator.peek()=='/')){
						right=operand.pop();
						left=operand.pop();
					switch (operator.pop()){
					case '*':
						result=left*right;
						break;
					case '/':
						result=left/right;
						break;
					}
						operand.push(result);
				}
				alternate=true;
			}
			else{
				//if((int)expr.charAt(i)-48>=0&&(int)expr.charAt(i)-48<=9){
				//	throw new InvalidStringException(expr);
				//}
				operator.push(expr.charAt(i));
				alternate=false;
			}
		}
		
		while(!operator.isEmpty()){
			right=operand.pop();
			left=operand.pop();
			switch (operator.pop()) {
			case '+':
				result=left+right;
				operand.push(result);
				break;
			case '-':
				result=left-right;
				operand.push(result);
				break;
			}
		}
		return operand.pop();
	}
	

}

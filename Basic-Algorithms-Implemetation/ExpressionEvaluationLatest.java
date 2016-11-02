package algorithms;

import java.util.Stack;

public class ExpressionEvaluationLatest {
	
	public int calculate(char c,int b,int a){
		switch(c){
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if(b==0){
				throw new UnsupportedOperationException("cannot divide zero");
			}
			return a/b;
	}
	return 0;
	}
	
	public boolean precedence(char a,char b){
		if(b=='('||b==')'){
			return false;
		}
		if((a=='*'||a=='/')&&(b=='+'||b=='-')){
			return false;
		}
		else 
			return true;
	}
	public int expressionEvaluation(String expression){
		boolean isPrevNumber=false;
		char[] tokens=expression.toCharArray();
		Stack<Integer> operands=new Stack<>();
		Stack<Character> operator=new Stack<>();
		for(int i=0;i<tokens.length;i++){
			if(tokens[i]==' '){
				isPrevNumber=false;
				continue;
			}
			if(tokens[i]=='('){
				operator.push(tokens[i]);
				isPrevNumber=false;
			}
			else if(tokens[i]>='0'&&tokens[i]<='9'){
				String sbuf="";
				if(isPrevNumber){
					sbuf=Integer.toString(operands.pop())+Character.toString(tokens[i]);
					operands.push(Integer.parseInt(sbuf));
				}else
					operands.push(Character.getNumericValue(tokens[i]));
				isPrevNumber=true;
			}
			else if(tokens[i]==')'){
				//pop operands array and do until we find '('
				
				while(operands.peek()=='('&&!operands.isEmpty()){
					operands.push(calculate(operator.pop(),operands.pop(),operands.pop()));
				}
				operands.pop();
				isPrevNumber=false;
			}
			else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/'){
				while(!operator.isEmpty()&&precedence(tokens[i],operator.peek())){
					operands.push(calculate(operator.pop(),operands.pop(),operands.pop()));
					
				}
					operator.push(tokens[i]);
					isPrevNumber=false;
			}
		}
		while(!operator.isEmpty()){
			operands.push(calculate(operator.pop(),operands.pop(),operands.pop()));
		}
		return operands.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionEvaluationLatest ee= new ExpressionEvaluationLatest();
		System.out.println(ee.expressionEvaluation("1+20+30"));
	}

}

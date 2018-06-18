import java.util.*;
public class whales {
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();
		stack.push("apples");
		output(stack);
		stack.push("bananas");
		output(stack);
		stack.push("grapes");
		output(stack);
		stack.push("melons");
		output(stack);
		stack.push("pumpkin");
		output(stack);
		
		stack.pop();
		output(stack);
		stack.pop();
		output(stack);
		stack.pop();
		output(stack);
		stack.pop();
		output(stack);
		stack.pop();
		output(stack);
	}
	//output method
	private static void output(Stack<String> s){
		if(s.isEmpty()){
			System.out.println("Stack empty!");
		}else{
		for(String x : s){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}}
}

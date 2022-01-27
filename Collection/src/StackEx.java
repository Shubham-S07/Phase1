import java.util.Stack;

public class StackEx {

public static void main(String[] args) {
		
	Stack<String> stack = new Stack<>();
	stack.push("KJ");
	stack.push("Jett");
	stack.push("Sova");
	stack.push("Omen");
	stack.push("Jim");
		String s1 = stack.pop();
		System.out.println(s1);		
	}
}
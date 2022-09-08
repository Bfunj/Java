package sub02;

import java.util.Stack;

/*
 * 2022.09.08
 * 백현조
 * 자료구조 스택 실습하기
 * 
 * 
 */
public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}

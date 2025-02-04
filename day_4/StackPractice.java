package day_4;

import java.util.Stack;

public class StackPractice {
	
	public static void main(String[] args) {
		
		Stack<Integer> num = new Stack<>();
		
		System.out.println("isStack Empty ? "+num.empty() );
		
		num.push(10);
		num.push(20);
		num.push(30);
		num.push(50);
		System.out.println("isStack Empty ? "+num.empty() );
		System.out.println(num);
		num.pop();
		System.out.println("Position of 20: "+num.search(20));
		int pos =num.peek();
		System.out.println("Top element: "+pos);
		System.out.println(num);
	}

}

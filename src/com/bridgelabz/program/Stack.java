package com.bridgelabz.program;

import com.bridgelabz.Utility.Utility;

public class Stack {
	
	

	public static void main(String[] args) {
		Utility utility = new Utility();
		Stack stack =  new Stack();
		utility.push(70);
		utility.push(30);
		utility.push(56);
		System.out.println(utility.peek());
		utility.pop();
		System.out.println(utility.peek());
		System.out.println("Stack" + utility.isEmpty());	
	

	
	}

}

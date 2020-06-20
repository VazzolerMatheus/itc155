

//5. Write a method called equals that accepts two stacks of integers as
//parameters and returns true if the two stacks store exactly the same
//sequence of integer values in the same order. Your method must restore
//the two stacks to their original state before returning. Use one stack as
//auxiliary storage.

import java.util.*;

public class StacksQueues {

	public static void main(String[] args) {
		
	//Test for same size and equals (true)
		Stack<Integer> test1 = new Stack<Integer>();
		Stack<Integer> test2 = new Stack<Integer>();
		
		test1.push(1);
		test1.push(2);
		test1.push(3);
		test1.push(4);
		test1.push(5);
		
		test2.push(1);
		test2.push(2);
		test2.push(3);
		test2.push(4);
		test2.push(5);
		
		System.out.println(equals(test1, test2));
		
		
	//Test for same size and not equals (false)
		Stack<Integer> test3 = new Stack<Integer>();
		Stack<Integer> test4 = new Stack<Integer>();
		
		test3.push(1);
		test3.push(2);
		test3.push(3);
		test3.push(4);
		test3.push(5);
		
		test4.push(1);
		test4.push(21);
		test4.push(3);
		test4.push(4);
		test4.push(5);
		
		System.out.println(equals(test3, test4));
		
	//Test for not the same size (false)
		Stack<Integer> test5 = new Stack<Integer>();
		Stack<Integer> test6 = new Stack<Integer>();
		
		test5.push(1);
		test5.push(2);
		test5.push(3);
		test5.push(4);
		test5.push(5);
		test5.push(6);
		test5.push(7);
		
		test6.push(1);
		test6.push(2);
		test6.push(3);
		test6.push(4);
		test6.push(5);
		
		System.out.println(equals(test5, test6));

	}
	
	public static boolean equals(Stack<Integer> stackOne, Stack<Integer> stackTwo) {
		
		boolean answer = true;
		
		Stack<Integer> auxStack = new Stack<Integer>();
		
		if (stackOne.size() != stackTwo.size()) {
			answer = false;
			return answer;
		} else {
			
			int valueStackOne;
			int valueStackTwo;
			int stackLengh = stackOne.size();
			
			for (int i = 1; i <= stackLengh ; i++) {
				
				//Pop the two stacks
				valueStackOne = stackOne.pop();
				valueStackTwo = stackTwo.pop();

				
				//confirm if they are equals
				if(valueStackOne != valueStackTwo) {
					answer = false;
				}
				
				//add the values to aux stack
				auxStack.push(valueStackOne);
				auxStack.push(valueStackTwo);
					
			}
			
			//add the values back to the original stack
			for(int i = 1; i <= stackLengh ; i++) {		
				stackTwo.push(auxStack.pop());
				stackOne.push(auxStack.pop());
			}
		}
		
		return answer;
			
	}

}

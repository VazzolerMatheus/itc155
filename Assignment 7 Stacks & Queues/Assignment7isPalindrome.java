package itc155;

import java.util.*;

public class Assignment7isPalindrome {

	public static void main(String[] args) {
		
		//false test
		Queue<Integer> test = new LinkedList<Integer>();
		test.add(3);
		test.add(7);
		test.add(1);
		test.add(14);
		test.add(9);
		
		System.out.println(isPalindrome(test));
		System.out.println("test :" + test);
		
		
		//true test
		Queue<Integer> test2 = new LinkedList<Integer>();
		test2.add(3);
		test2.add(8);
		test2.add(17);
		test2.add(9);
		test2.add(17);
		test2.add(8);
		test2.add(3);
		
		System.out.println(isPalindrome(test2));
		System.out.println("test :" + test2);
		
		//empty test (returns true)
		Queue<Integer> test3 = new LinkedList<Integer>();
		System.out.println(isPalindrome(test3));
		
	}
	
	public static boolean isPalindrome(Queue<Integer> numbers) {
		boolean palindrome = true;
		
		if(numbers.isEmpty()) {
			return palindrome;
		}
		
		Stack<Integer> auxStack = new Stack<Integer>();
		
		for(Integer item : numbers){
			auxStack.add(item);
		}
		
		while(!auxStack.isEmpty()){
			int tempStack = auxStack.pop();
			int tempQueue = numbers.remove();
			
			if(tempStack != tempQueue) {
				palindrome = false;
			}
			
			numbers.add(tempQueue);
		}
		
		return palindrome;
	}
}

package itc155;

import java.util.*;

public class Assignment7 {

	public static void main(String[] args) {
		
		Queue<Integer> test = new LinkedList<Integer>();
		test.add(3);
		test.add(7);
		test.add(1);
		test.add(14);
		test.add(9);
		
		stutter(test);
		System.out.println(test);
	}
		
	public static void stutter(Queue<Integer> numbers) {
		Queue<Integer> aux = new LinkedList<Integer>();
		
		for(Integer item : numbers){
		    aux.add(item);
		}
		
		numbers.clear();
		
		for(Integer item : aux){
			numbers.add(item);
			numbers.add(item);
		}
		
		aux.clear();
	
	}
}

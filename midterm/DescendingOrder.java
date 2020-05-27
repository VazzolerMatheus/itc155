package itc155;
import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
// TODO: Write a void method selectionSortDescendTrace() that takes
// an integer array and the number of elements in the array as arguments,
// and sorts the array into descending order.
public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	int [] finalArray = new int[numElements]; 
	
	//create a new array with the size of the number of elements the user chose 
	for (int x = 0; x < numElements; x ++) {
		finalArray[x] = numbers[x];
	}
	
	
	int arrayLength = 	finalArray.length;
	for (int i = 0; i < arrayLength-1; i++) {
		
		int index = i;
		for(int y = i+1 ; y < arrayLength ; y ++) {
			if(finalArray[y] > finalArray[index]) {
				index = y;
			}
		}
		
		int temp = finalArray[index];
		finalArray[index] = finalArray[i];
		finalArray[i] = temp;
		
		System.out.println(Arrays.toString(finalArray) );
	}
	
	
}


public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

int input, i = 0;
int numElements = 0;
int [] numbers = new int[10];

// TODO: Read in a list of up to 10 positive integers; stop when
// -1 is read. Then call selectionSortDescendTrace() method.

System.out.println("Enter list of numbers: ");

input = scnr.nextInt();

while (input != -1) {
	numbers[i] = input;
	input = scnr.nextInt();
	i++;
	numElements ++;
}

selectionSortDescendTrace(numbers, numElements);

}
}

package itc155;

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

// TODO: Write method to create and output all permutations of the list of names.
public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

	int size = nameList.size();

	//break case
	int i;
	if (size == 0) {
		for (i = 0; i < permList.size(); ++i) {
			System.out.print(permList.get(i) + " ");
		}
		System.out.println();
		
	} 
	
	//recursive
	else {
		for (i = 0; i < size; ++i) { 


			ArrayList<String> finalPerms = new ArrayList<String>(permList);
			
			finalPerms.add(nameList.get(i));

			ArrayList<String> finalNames = new ArrayList<String>(nameList);

			finalNames.remove(i);
			
			allPermutations(finalPerms, finalNames);
		}
	}
}


public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
ArrayList<String> nameList = new ArrayList<String>();
ArrayList<String> permList = new ArrayList<String>();
String name;

System.out.println("Enter list of names: ");

name = scnr.next();

while (!name.equals("-1")) {
	nameList.add(name);
	name = scnr.next();
}
	
	allPermutations(permList, nameList);
}

}
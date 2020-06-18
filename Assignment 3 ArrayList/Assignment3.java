package itc155;

import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("how");
		list.add("are");
		list.add("you?");
		doubleList(list);
	}
	
	public static void doubleList(ArrayList<String> list){
	    for(int i = 0; i < list.size(); i+=2){
	    	list.add(i + 1, list.get(i));
	    }   
	    
	    System.out.print(list);
	}

}

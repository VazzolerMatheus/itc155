import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
		
		
		//True case
		Map<String, String> test = new HashMap<String, String>(); 
		test.put("Marty", "Steep");
		test.put("Stuart", "Reges");
		test.put("Jessica", "Miller");
		test.put("Amanda", "Camp");
		test.put("Hal", "Perkins");
		
		System.out.println(isUnique(test));
		
		//False case
		Map<String, String> test2 = new HashMap<String, String>(); 
		test2.put("Marty", "Steep");
		test2.put("Stuart", "Reges");
		test2.put("Jessica", "Miller");
		test2.put("Amanda", "Camp");
		test2.put("Hal", "Camp");
		
		System.out.println(isUnique(test2));
	}
	
	public static boolean isUnique(Map<String, String> test) {
		Collection<String> first = test.values();
	    Set<String> notDuplicate = new HashSet<>();
	    
	    for(String test1 : first){
	    	notDuplicate.add(test1);
	    }
	    
	    if(test.size() > notDuplicate.size()){
	        return false;
	    }
	   
	    return true;
	}
		
	}



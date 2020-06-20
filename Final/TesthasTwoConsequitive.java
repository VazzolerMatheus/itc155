
public class TesthasTwoConsequitive {

	public static void main(String[] args) {
		
		//test for true
		LinkedIntList test1 = new LinkedIntList();
		test1.add(1);
		test1.add(4);
		test1.add(5);
		test1.add(10);
		System.out.println(test1.hasTwoConsecutive());
		
		//test for false
		LinkedIntList test2 = new LinkedIntList();
		test2.add(1);
		test2.add(3);
		test2.add(5);
		test2.add(2);
		test2.add(10);
		
		System.out.println(test2.hasTwoConsecutive());
		
	}

}

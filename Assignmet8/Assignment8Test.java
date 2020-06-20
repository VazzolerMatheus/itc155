package itc155;

public class Assignment8Test {

	public static void main(String[] args) {

		// test for false (not sorted)
		LinkedIntList test1 = new LinkedIntList();
		test1.add(1);
		test1.add(2);
		test1.add(-1);
		test1.add(10);
		System.out.println(test1.isSorted());

		// test for true (sorted)
		LinkedIntList test2 = new LinkedIntList();
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		System.out.println(test2.isSorted());
		
		// test for true (empty)
		LinkedIntList test3 = new LinkedIntList();
		System.out.println(test3.isSorted());
	}

}

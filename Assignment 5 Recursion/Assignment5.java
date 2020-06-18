package itc155;

public class Assignment5 {

	public static void main(String[] args) {

		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
	}
	
	public static void writeNums(int number) {
		
		if(number < 1){
	        throw new IllegalArgumentException();
	    }
		
		if(number == 1) {
			System.out.print(number + " ");
			return;
		} else {
			writeNums(number - 1);
			System.out.print(number + " ");
		}
	
}
}
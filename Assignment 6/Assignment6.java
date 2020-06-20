package itc155;


//	4. To which complexity class does the following algorithm belong?
//	Consider N to be the length or size of the array or collection passed to
//	the method. Explain your reasoning.

//	public static int[] mystery1(int[] list) {
//	int[] result = new int[2 * list.length];
//	for (int i = 0; i < list.length; i++) {
//	result[2 * i] = list[i] / 2 + list[i] % 2;
//	result[2 * i + 1] = list[i] / 2;
//	}
//	return result;
//	}

//	Answer: The algorithm belongs to O(n) complexity because of its main loop. This loop will run N times at the worst case scenario
//	(N times because of list.length being the stop condition)




//	5. To which complexity class does the following algorithm belong?

//	public static void mystery2(int[] list) {
//	for (int i = 0; i < list.length / 2; i++) {
//	int j = list.length – 1 – i;
//	int temp = list[i];
//	list[i] = list[j];
//	list[j] = temp;
//	}
//	}

//	Answer: The algorithm belongs to O(n) . Much like the previous one, this the main loop on this algorithm will run n/2 times
//	and by the Big O notation, it falls off into the O(n) category.


public class Assignment6 {

//	This is the modified version:
//  Answer: The complexity of this algorithm it the same as the normal version of the SelectionSort, which is O(N^2). No faster nor slower.
		
	void modifiedSelectionSort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 

            int max_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] > arr[max_idx]) 
                    max_idx = j; 
   
            int temp = arr[max_idx]; 
            arr[max_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 

}

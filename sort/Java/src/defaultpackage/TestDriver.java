package defaultpackage;

public class TestDriver {
	
	public static void main(String[] args) {
		Integer [] a = {5, 2, 1, 9, 8, 5, 7, 4, 6, 3};
		SelectionSort.sort(a); 
		SelectionSort.show(a);
		
		Integer [] b = {5, 2, 1, 9, 8, 5, 7, 4, 6, 3};
		InsertionSort.sort(b);
		InsertionSort.show(b);
		
		Integer [] c = {5, 2, 1, 9, 8, 5, 7, 4, 6, 3};
		QuickSort.sort(c);
		QuickSort.show(c);
		
		Integer [] d = {5, 2, 1, 9, 8, 5, 7, 4, 6, 3};
		HeapSort.sort(d);
		HeapSort.show(d);
	}
}

package defaultpackage;

/*****/
@SuppressWarnings("rawtypes")
public class HeapSort extends AbstractSort{
	
	public static void sort(Comparable[] a) {
		int n = a.length - 1;
		
		for(int i = n / 2; i>= 0;i--) {
			adjust(a, i, n);
		}
		
		for(int i = n; i >= 0; i--) {
			swap(a, 0, i);
			adjust(a, 0, i-1);
		}
	}
	
	
	private static void adjust(Comparable[] a, int root, int n) {
		Comparable rootkey = a[root];
		int child = root * 2 + 1;
		while(child <= n) {
			if(child < n && less(a[child],a[child+1]))
				child += 1;
			if(less(a[child],rootkey))
				break;
			a[(child - 1)/2] = a[child];
			child = child * 2 +1;
		}
		a[(child - 1)/2] = rootkey;
	}
}

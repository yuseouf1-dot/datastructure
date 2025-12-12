package defaultpackage;

import java.util.Arrays;

@SuppressWarnings("rawtypes")
public class MergeSort extends AbstractSort {
	
	public static void sort(Comparable[] a) {
		Comparable[] src = a;
		Comparable[] dst = new Comparable[a.length];
		Comparable[] tmp;
		int N = a.length;
		
		for(int n = 1; n <= N; n *= 2) {
			for(int i = 0; i < N; i += 2*n) {
				merge(src,dst,i,i+n-1,Math.min(i+2*n-1, N-1));
			}
			tmp = src;
			src = dst;
			dst = tmp;
		}
		
		if(src != a)
			System.arraycopy(src, 0, dst, 0, N);
	}
	
	private static void merge(Comparable[] list, Comparable[] sorted, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi; k++) {
			if(j > hi)
				sorted[k] = list[i++];
			else if(i > mid)
				sorted[k] = list[j++];
			else if(less(list[i],list[j]))
				sorted[k] = list[i++];
			else
				sorted[k] = list[j++];
		}
	}
}

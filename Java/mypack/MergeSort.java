//MergeSort algorithm
class MergeSort{
	int [] a = {1, -2, 3, -10, -29};
	int beg, end;

	void mergeSort(int[] a, int p, int r){
		if(p < r){
			int q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q+1, r);
			merge(a, p, q, r);
		}
	}

	void merge(int[] a, int p, int q, int r){
		int m = q - p + 1, n = r - q;
		int [] a1,a2;
		a1 = new int[m+1];
		a2 = new int[n+1];

		for(int i=0;i<m;i++) a1[i] = a[p+i];
		for(int i=0;i<n;i++) a2[i] = a[q+i+1];
			a1[m] = a2[n] = Integer.MAX_VALUE;

		int t=0,j=0; 
		for(int k=p;k<=r;k++){
			if(a1[t] <= a2[j]){
				a[k] = a1[t];
				t++;
			}else{
				a[k] = a2[j];
				j++;
			}
		}
	}
	public static void main(String[] args){
		MergeSort ob = new MergeSort();
		System.out.print("Initial array: ");
		for(int x : ob.a) System.out.print(x + " ");
		ob.beg = 0;
		ob.end = ob.a.length - 1;
		//System.out.println("\n" + Integer.MAX_VALUE);
		ob.mergeSort(ob.a,ob.beg,ob.end);

		System.out.print("\nSorted array: ");
		for(int x : ob.a) System.out.print(x + " ");
	}

}
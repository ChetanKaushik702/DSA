//A multi-threading demo
class ThreadA extends Thread{
	int [] a = {10, -1, -10};
	int p = 0, r = a.length - 1;

	void MergeSort(int[] a, int beg, int end){
		if(beg < end){
			int mid = (beg + end) / 2;
			MergeSort(a, beg, mid);
			MergeSort(a, mid + 1, end);
			Merge(a, beg, mid, end);
		}
	}
	public void run(){
		//System.out.print(p + " " + r);
		//for(int x : a) System.out.print( x + " ");
		MergeSort(a, p, r);
	}

	void Merge(int[] a, int beg, int mid, int end){
		int n1 = mid - beg + 1, n2 = end - mid;
		int [] a1, a2;
		a1 = new int[n1+1];
		a2 = new int[n2+1];
		a1[n1] = a2[n2] = Integer.MAX_VALUE;

		for(int i=0;i<n1;i++) a1[i] = a[beg+i];
		for(int i=0;i<n2;i++) a2[i] = a[mid+i+1];
    
    		int i=0,j=0;
		for(int k=beg;k<=end;k++){
			if(a1[i] <= a2[j]){
				a[k] = a1[i];
				i++;
			} else {
				a[k] = a2[j];
				j++;
			}
		} 
	}
	
}

class Thread1{
	static public void main(String[] args){
		ThreadA ob = new ThreadA();
		ob.start();
		//ob.MergeSort(a, beg, end);
		for(int x : ob.a) System.out.print(x + " ");
	}
}
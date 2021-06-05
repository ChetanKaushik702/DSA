import java.util.Scanner;

public class HeapSort {
    // private int heapsize;

    // parent of a node
    static int parent(int i) {return i/2;}

    // left-child
    static int leftChild(int i) {return 2*i;}

    // right-child
    static int rightChild(int i) {return 2*i+1;}


    // max-heapify
    static void maxHeapify(int a[], int i, int n) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest;
        if (left <= n && a[i] < a[left])
            largest = left;
        else
            largest = i;
        if (right <= n && a[largest] < a[right])
            largest = right;
        
        if (largest != i) {
            // swap a[i] with a[largest]
            a[i] = a[i] + a[largest];
            a[largest] = a[i] - a[largest];
            a[i] = a[i] - a[largest];

            // heap property might not get fulfilled
            maxHeapify(a, largest, n);
        }
    }

    // build heap
    static void buildMaxHeap(int a[], int n) {

        /* bottom-up approach of building the heap 
        ** Since, the leaf nodes follow the max-heap property,
        ** so try building heap from the first non-leaf node in
        ** the bottom-up manner
        */

        for (int i=n/2; i>=1; i--)
            maxHeapify(a, i, n);
    }

    // heapsort
    static void heapSort(int a[], int n) {
        int heapSize = n;
        buildMaxHeap(a, n);
        for (int i=heapSize; i>=2; i--) {
            // swap the elements a[1] and a[heapSize]
            int temp = a[1];
            a[1] = a[i];
            a[i] = temp;
            
            heapSize -= 1;
            maxHeapify(a, 1, heapSize);
        }
    }

    // heap maximum element
    static int heapMax(int a[]) {
        if (a.length-1 < 1) {
            System.out.println("Heap underflow...");
            return Integer.MIN_VALUE;
        }
        return a[1];
    }

    // heap-extract-max element
    static int extractHeapMax(int a[], int n) {
        if (n < 1) {
            System.out.println("Heap underflow...");
            return Integer.MIN_VALUE;
        }
        int max = a[1];
        a[1] = a[n];
        n = n - 1;
        buildMaxHeap(a, n);
        return max;
    }

    // heap-increase-key
    static void increaseKey(int a[], int key, int i) {
        if (a[i] > key) {
            System.out.println("Key is smaller than the current key...");
        }
        else {
            a[i] = key;
            while (i > 1 && a[parent(i)] < a[i]) {
                // exchange a[parent[i]] with a[i]
                int temp = a[parent(i)];
                a[parent(i)] = a[i];
                a[i] = temp;

                // update i
                i = parent(i);
            }
        }
    }

    // heap-insert element
    static void heapInsert(int a[], int x, int n) {
        if (n == a.length) {
            // doubling the array size
            int dble[] = new int[2*a.length];
            for (int i=0; i<a.length; i++)  dble[i] = a[i];
            a = dble;

            // update n to n+1;
            n = n+1;
            a[n] = Integer.MIN_VALUE;
            increaseKey(a, x, n);
        }else {
            n = n+1;
            a[n] = Integer.MIN_VALUE;
            increaseKey(a, x, n);
        }
    }
    
    // driver code
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            a[0] = n;
            for (int i=1; i<=n; i++) a[i] = sc.nextInt();

            heapSort(a, n);
            for (int i=1; i<=n; i++)   System.out.print(a[i] + " ");
        }
    }
}

public class CountingSort {
    
    // counting sort procedure
    static void countingSort(int A[], int k) {

        // declare resultant array B[1...A.length]
        int B[] = new int[A.length];

        // C[0...k]
        int C[] = new int[k+1]; // each C[i] is initialised with 0

        // count the occurance of i and store it in C[i]
        for (int i=0; i<A.length; i++) 
            C[A[i]] = C[A[i]] + 1;
        
        // count the occurance of elements less than or equal to i in C[i]
        for (int i=1; i<=k; i++)
            C[i] = C[i] + C[i-1];
        
        // finally sorting the elements and storing them in the array B[1...A.length]
        for (int i=A.length-1; i>=0; i--) {
            B[C[A[i]]-1] = A[i];
            C[A[i]] = C[A[i]] - 1;
        }

        // copying B into A
        for (int i=0; i<A.length; i++)
            A[i] = B[i];
    }

    // driver method
    public static void main(String[] args) {
        int A[] = {6, 0, 2, 0, 1, 3, 4, 6, 1, 3, 2};
        countingSort(A, 6);
        for (int x:A)   System.out.print(x + " ");
    }
}

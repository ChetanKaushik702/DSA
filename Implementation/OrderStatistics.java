public class OrderStatistics {
    
    static int randomizedSelect(int A[], int p, int r, int i) {
        // for single element
        if (p == r)
            return A[p];
        
        int q = QuickSort.randomisedPartition(A, p, r);
        int k = q - p + 1;

        if (i == k)
            return A[q];
        else if (i < k)
            return randomizedSelect(A, p, q-1, i);
        else
            return randomizedSelect(A, q+1, r, i-k);
    }

    static int iterativeRandomizedSelect(int A[], int p, int r, int i) {

        while (p < r) {
            int q = QuickSort.randomisedPartition(A, p, r);
            int k = q - p + 1;
            if (i == k)
                return A[q];
            else if (i < k)
                r = q - 1;
            else {
                i = i - k;
                p = q + 1;
            }
        }

        return A[r];
    }
    // driver method
    public static void main(String[] args) {
        int A[] = {2, 4, 1, 5, 6, -1, 0};
        int p = 0, r = A.length-1;
        
        for (int i=1; i<r+2; i++) {
            System.out.println(i + ": " + randomizedSelect(A, p, r, i));
            System.out.println(i + ": " + iterativeRandomizedSelect(A, p, r, i));
        }
    }
}

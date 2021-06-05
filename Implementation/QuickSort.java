import java.util.*;
import java.io.*;

public class QuickSort {

    // partition procedure
    static int partition(int A[], int p, int r) {

        int x = A[r]; // pivot
        int i = p-1, j = p; // setting up the pointers
        
        while (j < r) {
            if (A[j] <= x) {
                i = i+1; // update i
                // swap A[i] with A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            // increment j
            j = j+1;
        }

        // swap A[i+1] with A[r]
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        
        return i+1; // split about i+1
    }

    // quickSort() method
    static void quickSort(int A[], int p, int r) {

        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }

    // randomised partition routine
    static int randomisedPartition(int A[], int p, int r) {
        // pick a random element from the r-p+1 elements
        Random rand = new Random();
        int randInt = p + rand.nextInt(r-p);

        // swap A[r] with A[randInt]
        int temp = A[r];
        A[r] = A[randInt];
        A[randInt] = temp;

        // call partition
        return partition(A, p, r);
    }

    // randomised quickSort() routine
    static void randomisedQuicksort(int A[], int p, int r) {

        if (p < r) {
            int q = randomisedPartition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        } 
    }

    // 3-way partitioning procedure
    static String partition_3_way(int A[], int p, int r) {
        int x = A[r]; // pivot
        int i=p-1, j=p;

        while (j < r) {
            if (A[j] < x) {
                i += 1;
                // swap A[i] with A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            j = j+1;
        }

        int t = i;
        j = i+1;

        while (j < r) {
            if (A[j] == x) {
                t = t + 1;
                // swap A[t] with A[j]
                int temp = A[t];
                A[t] = A[j];
                A[j] = temp;
            }
            j = j+1;
        }

        // swap A[t+1] with A[r]
        int temp = A[t+1];
        A[t+1] = A[r];
        A[r] = temp;

        return i + " " + (t+2);
    }

    // quickSort procedure for 3-way partitioning procedure
    static void quickSort_3_way(int A[], int p, int r) {
        if (p < r) {
            String s[] = partition_3_way(A, p, r).split(" ");
            int q = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            quickSort_3_way(A, p, q);
            quickSort_3_way(A, t, r);
        }
    }
    // driver method
    public static void main(String[] args) {
        File inp = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Implementation\\input.txt");
        try(Scanner sc = new Scanner(inp)) {
            int n = sc.nextInt();
            int Aq[] = new int[n];
            int Arq[] = new int[n];
            int p=0, r=n-1;
            for (int i=0; i<n; i++) {
                Aq[i] = sc.nextInt();
                Arq[i] = Aq[i];
            }
            long beg = System.currentTimeMillis();
            quickSort_3_way(Arq, p, r);
            long end = System.currentTimeMillis();
            System.out.println("Time taken by 3-way quickSort is: " + (end-beg) + "ms.");
            
            beg = System.currentTimeMillis();
            // randomisedQuicksort(Arq, p, r);
            quickSort(Aq, p, r);
            end = System.currentTimeMillis();
            System.out.println("Time taken by quickSort is: " + (end-beg) + "ms.");
            
        }catch (FileNotFoundException exc) {
            System.out.println("File not found...");
        }
        
    }
}

import java.util.*;

public class WatchCPL {

    // sum is 2*k
    static int findSubset(int h[], int total, int i, Hashtable<String, Integer> mem) {
        String key = total + ":" + i;
        // memoized case
        if (mem.get(key) != null) return mem.get(key);

        // base case
        if (total == 0) return 1;
        if (i < 0 || total < 0) return 0;

        // recursive case
        int result;
        if (total < h[i]) result =  findSubset(h, total, i-1, mem);
        else    result =  findSubset(h, total, i-1, mem) + findSubset(h, total-h[i], i-1, mem);
        mem.put(key, result);
        return result;
    }

    static int dp_findSet(int h[], int total) {
        Hashtable<String, Integer> mem = new Hashtable<>();
        return findSubset(h, total, h.length-1, mem);
    }

    // sum > 2*k 
    
    // driver code
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int h[] = new int[n];
                int sum=0;
                for (int i=0; i<n; i++) {
                    h[i] = sc.nextInt();
                    sum += h[i];
                }
                
                // sum < 2*k
                if (sum < (k << 1))     System.out.println(-1);
                else if (sum == (k << 1)) { // sum == 2*k
                    int val = dp_findSet(h, k);
                    if (val != 0)  System.out.println(n);
                    else System.out.println(-1);
                }
            }
        }
    }
}

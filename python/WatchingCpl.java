import java.util.*;
class Codechef {

    // find sum
    static long sum(long a[]) {
        long sum=0;
        for (int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }

    // check if the subset of a given sum exists
    static int dp(long a[], int i, int total) {
        Hashtable<String, Integer> mem = new Hashtable<>();
        return checkSubset(a, i, total, mem);
    }

    static int checkSubset(long a[], int i, int total, Hashtable<String, Integer> mem) {
        String key = total + ":" + i;
        if (mem.get(key) != null)
            return mem.get(key);
        if (total == 0)
            return 1;
        else if (total < 0 || i < 0)
            return 0;
        int value;
        if (total < a[i])
            value = checkSubset(a, i-1, total, mem);
        else 
            value = checkSubset(a, i-1, total, mem) | checkSubset(a, i-1, (int)(total-a[i]), mem);
        mem.put(key, value);
        return value;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                long h[] = new long[n];
                for (int i=0; i<n; i++) h[i] = sc.nextLong();

                // logic begins here
                if (n == 1) System.out.println(-1);
                else {
                    // sort the array
                    Arrays.sort(h);
                    long a[] = new long[n];
                    for (int i=0; i<n; i++)
                        a[i] = h[n-i-1];
                    
                    // max >= k
                    if (a[0] >= k) {
                        boolean flag = false;
                        long s = 0;
                        for (int i=1; i<n; i++) {
                            s += a[i];
                            if (s >= k) {
                               flag = true;
                               System.out.println(i+1);
                               break;
                            }
                        }
                        if (flag) System.out.println(-1);
                    }else {
                        if (sum(a) == (k << 1)) { // sum = 2k
                            if (dp(a, k, a.length-1) == 1)
                                System.out.println(n);
                            else
                                System.out.println(-1);
                        }else {
                            long s = 0;
                            ArrayList<Long> l = new ArrayList<>();
                            for (int i=0; i<n; i++) {
                                s += a[i];
                                if (s >= 2*k) {
                                    for (int j=0; j<=i; j++) 
                                        l.add(a[j]);
                                    break;
                                }
                            }
                            long cl[] = new long[l.size()];
                            for (int i=0; i<l.size(); i++)
                                cl[i] = l.get(i);
                            
                            if (dp(cl, k, cl.length-1) == 1)
                                System.out.println(cl.length);
                            else {
                                
                            }
                        }
                    }
                }
            }
        }
    }
}
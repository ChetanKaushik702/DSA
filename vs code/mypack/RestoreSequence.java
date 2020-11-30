import java.util.Scanner;
public class RestoreSequence {

    static boolean [] sieve(int n) {
        int m = (int)(4*Math.pow(10, 6));
        boolean prime[] = new boolean[m+1];
        for (int p=2; p*p<=m && n > 0; p++) {
            if(prime[p] == false) {
                n--;
                for (int i=p*p; i<=m; i+=p) 
                    if (prime[i] == false)
                        prime[i] = true;
            }
        }
        return prime;
    }

    static int[] getPrime(int p) {
        boolean prm[] = sieve(p);
        int prime[] = new int[p];
        int t=0;
        for (int i=2; i<=4*1000000 && p > 0; i++) 
            if (prm[i] == false) {
                prime[t++] = i;
                p--;
            }
        
        return prime;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while(T-- > 0) {
                int n = sc.nextInt();
                int b[] = new int[n];
                int p = 0;
                for (int i=0; i<n; i++) {
                    b[i] = sc.nextInt();
                    if (b[i] == i+1)
                        p++;
                }
                int a[] = new int[n];
                int v = n;
                for (int i=0; i<n; i++) {
                    if (a[i] != 0)
                        continue;
                    if (b[i] != i+1) {
                        if (a[b[i]-1] == 0) {
                            a[b[i]-1] = v;
                            a[i] = v;
                            v--;
                        }else {
                            a[i] = a[b[i]-1];
                        }
                    }else {
                        a[i] = v;
                        v--;
                    }
                }
                for (int x: a) System.out.print(x + " ");
                System.out.println();
                // if (p == 1) {
                //     for (int i=0; i<n; i++)
                //         System.out.print(1 + " ");
                // }else if(p == n) {
                //     for (int i=n+1; i>=2; i--)
                //         System.out.print(i + " ");
                // }else {
                //     int prime[] = getPrime(p);
                //     // for (int x:prime) System.out.println(x);
                //     int t=0;
                //     int a[] = new int[n];
                //     for (int i=0; i<n; i++) {
                //         if (a[i] != 0)
                //             continue;
                //         if (b[i] != i+1) {
                //             if (a[b[i]-1] != 0)
                //                 a[i] = a[b[i]-1];
                //             else {
                //                 a[i] = prime[t++];
                //                 a[b[i]-1] = a[i];
                //             }
                //         }else {
                //             a[i] = prime[t++];
                //         }
                //     }
                //     for (int x:a)   System.out.print(x + " ");
                // }
                // System.out.println();
            }
        }
    }
}

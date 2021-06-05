package Codechef;

import java.util.Scanner;
class HailXOR {
    static long powerOf2(long n) {
        int power = 0;
        while (n != 0) {
            if (n == 1)
                break;
            n = n >> 1;
            power++;
        }
        return power;
    }

    static void solver(long a[], int x) {
        int i=0;
        while (x-- > 0 && i < a.length) {
            long p = powerOf2(a[i]);
            // System.out.println("p: " + p);
            if ((1 << p) == a[i]) {
                a[i] = 0;
                a[i+1] = a[i+1] ^ (1 << p);
                
                i++;
            }else {
                a[i] = a[i] ^ (1 << p);
                a[i+1] = a[i+1] ^ (1 << p);
            }
            // for (int v:a) System.out.print(v + " ");
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            long a[] = new long[n];
            for (int i=0; i<n; i++) a[i] = sc.nextLong();
            solver(a, x);
            for (long v:a) System.out.print(v + " ");
            System.out.println();
        }
        sc.close();
    }
}
package Codechef;

import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == k) {
                for (int i=1; i<=n; i++)    System.out.print(i + " ");
            }else if (k == 1) {
                System.out.print(1 + " ");
                for (int i=2; i<=n; i++)    System.out.print((-i) + " ");
            }else {
                int a[] = new int[n];
                for (int i=1; i<=n; i++)    a[i-1] = i;
                int neg = n-k;
                int i=1;
                while (neg > 0 && i < n) {
                    a[i] = -a[i];
                    neg--;
                    i+=2;
                }
                if (neg > 0) {
                    if (n%2 == 0)
                        i = n-2;
                    else
                        i = n-1;
                    while (neg > 0 && i >= 0) {
                        a[i] = -a[i];
                        neg--;
                        i-=2;
                    }
                }
                for (int x:a) System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

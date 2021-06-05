package Codechef;

import java.util.Scanner;

public class PositivePrefixes {

    static int negate(int a[], int neg) {
        int i=3, n = a.length;
        while (i <= n && neg > 0) {
            a[i-1] = -i;
            neg--;
            i++;
            if ((i-1)%4 == 0)
                i += 2;
        }
        return neg;
    }
    
    static void negateFromEnd(int a[], int neg) {
        int n=a.length;
        int i=n-1;
        while(neg > 0) {
            if (a[i] > 0) {
                a[i] = -a[i];
                neg--;
            }
            i--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == n) 
                for (int i=1; i<=n; i++)    System.out.print(i + " ");
            else if (k == 1)  {
                System.out.print(1 + " ");
                for (int i=2; i<=n; i++)    System.out.print(-i + " ");
            }else if (n == 2 && k == 1)     System.out.print(1 + " " + (-2));
            else {
                int a[] = new int[n];
                for (int i=1; i<=n; i++)    a[i-1] = i;
                int neg = negate(a, n-k);
                if (neg > 0)
                    negateFromEnd(a, neg);
                int count = 0;
                for (int x:a) {
                    System.out.print(x + " ");
                    if (x < 0)  count++;
                }
                System.out.println("\n" + count);
            }
        }
        sc.close();
    }
}

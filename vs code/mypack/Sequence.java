import java.util.Scanner;

public class Sequence {

    static int getPrime(int n) {
        if (n <= 1)
            return 2;
        int prime = 2;
        int flag = 0;
        while(true) {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                prime = n;
                break;
            }
            n = n+1;
            flag = 0;
        }
        return prime;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                // System.out.println(getPrime(n));
                int b[] = new int[n];
                int p = 0; 
                for (int i=0; i<n; i++) {
                    b[i] = sc.nextInt();
                    if (b[i] == i+1)
                        p++;
                }
                if(p == 1) {
                    for (int i=0; i<n; i++)
                        System.out.print(n + " ");
                }else if (p == n) {
                    for (int i=n; i>=1; i--)
                        System.out.print(i+ " ");
                }else {
                    int a[] = new int[n];
                    int d = n-1, prime = n+1;
                    if (b[0] != 1) {
                        a[b[0]-1] = n;
                        a[0] = n;
                    }else   a[0] = n;
                    for (int i=1; i<n; i++) {
                        if (a[i] != 0)
                            continue;
                        if (a[b[i]-1] != 0) {
                            a[i] = a[b[i]-1];
                        }else {
                            if (n%d == 0) {
                                prime = getPrime(prime);
                                a[b[i]-1] = prime;
                                a[i] = prime;
                                d--;
                            }else {
                                a[b[i]-1] = d;
                                a[i] = d;
                                d--;
                            }
                        }
                    }
                    for (int x:a) System.out.print(x + " "); 
                }
                System.out.println();
            }
        }
    }
}

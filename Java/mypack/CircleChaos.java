import java.util.Scanner;

public class CircleChaos {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }

    static int maxFact(int p, int n) {
        int max = 1;
        for (int i=1; i*i<=n; i++) {
            if (p%i == 0) {
                if (i <= n)
                    max = Math.max(max, i);
                if (p/i <= n)
                    max = Math.max(max, p/i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int p[] = new int[m];
                int hcf=0;
                for (int i=0; i<m; i++) {
                    p[i] = sc.nextInt();
                    hcf = gcd(p[i], hcf);
                }
                System.out.println(n-maxFact(hcf, n));
            }
        }
    }
}

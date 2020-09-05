import java.util.Scanner;

public class BerlandPoker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();

                if (m == 0 || n == m) System.out.println(0);
                else if (m < n/k) System.out.println(m);
                else {
                    m = m - n/k;
                    int p = m/(k-1);
                    if (m % (k-1) == 0)
                        System.out.println(n/k - p);
                    else 
                        System.out.println(n/k - p - 1);
                }
            }
        }
    }
}

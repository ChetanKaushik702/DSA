import java.util.Scanner;

public class Division {
    static boolean isPrime(long n) {
        for (long i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long solveForx(long p, long q) {
        long ans = 1;
        for (long i=p; i>=1; i--) {
            if (p % i == 0 && i % q != 0) {
                ans = i;
                break;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();
            if (isPrime(p))
                System.out.println(p);
            else
                System.out.println(solveForx(p, q));
        }
        sc.close();
    }
}
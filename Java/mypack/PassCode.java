import java.util.Scanner;

public class PassCode {

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans=1;
            for (long p=1; p<b; p++) {
                if (gcd(a, b) == gcd(a+p, b))
                    ans++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

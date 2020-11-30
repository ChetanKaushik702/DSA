import java.util.Scanner;
public class Apartments {

    private static void solve(int n) {
        if (n == 1 || n == 2 || n == 4) {
            System.out.println(-1);
            return;
        }
        if (n % 3 == 0)
            System.out.println(n/3 + " 0 0");
        else if (n % 3 == 1)
                System.out.println((n-7)/3 + " 0 1");
        else
            System.out.println((n-5)/3 + " 1 0");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
        sc.close();
    }
}

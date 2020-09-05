import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc.nextInt();

            int Q = N / x, R = N % x;
            if (y < R) System.out.println(Q*x + y);
            else if (y > R) System.out.println((Q-1)*x + y);
            else System.out.println(N);
        }
        sc.close();
    }    
}
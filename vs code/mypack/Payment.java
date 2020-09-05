import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long S = sc.nextLong();
            if (S%n <= b && (n * a + b >= S)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}

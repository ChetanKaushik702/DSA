import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = 0;
            while (n != 0) {
                ans += n/5;
                n /= 5;
            }
            System.out.println(ans);
        }
    }
}

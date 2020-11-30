import java.math.BigInteger;
import java.util.Scanner;

public class BitStrings {
    static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            BigInteger ans = BigInteger.valueOf(2);
            ans = ans.pow(n);
            ans = ans.remainder(BigInteger.valueOf(MOD));
            System.out.println(ans);
        }
    }
}

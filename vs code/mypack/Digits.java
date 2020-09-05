import java.math.BigInteger;
import java.util.*;
public class Digits {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            if (t > 4 && t < 10) {
                BigInteger out = BigInteger.valueOf(t);
                System.out.println(out.pow(n));
            }
            else {
                if (n == 1 && t <= 9) System.out.println(t);
                else if (n == 1 && t == 10) System.out.println(-1);
                else if (t == 2) {
                    
                }
            }
        }
    }
}
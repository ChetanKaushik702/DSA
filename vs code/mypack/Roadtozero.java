import java.math.BigInteger;
import java.util.Scanner;

public class Roadtozero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                long a = sc.nextLong();
                long b = sc.nextLong();
                
                BigInteger amount = BigInteger.ZERO;
                while (true) {
                    if (x == 0 && y == 0)
                        break;
                    long diff = Math.abs(x-y);
                    if (diff == 0) {
                        if (2*x*a <= x*b) 
                            amount = amount.add(BigInteger.valueOf(2*x*a));
                        else 
                            amount = amount.add(BigInteger.valueOf(x*b));
                        x = 0;
                        y = 0; 
                    }else {
                        amount = amount.add(BigInteger.valueOf(diff*a));
                        if (x > y)
                            x = x - diff;
                        else
                            y = y - diff;
                    }
                }
                System.out.println(amount);
            }
        }
    }
}
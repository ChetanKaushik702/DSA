import java.util.Scanner;

public class MinProduct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long x = sc.nextLong();
                long y = sc.nextLong();
                long n = sc.nextLong();
                long prod = Long.MAX_VALUE, at = a, bt = b, t = n;
                if (at-x <= t) {
                    at = x;
                    t = t - (a-x);
                    if (bt-y <= t) {
                        bt = y;
                        if (prod > at*bt) {
                            prod = at*bt;
                        }
                    }else {
                        bt = bt - t;
                        if (prod > at*bt) {
                            prod = at*bt;
                        }
                    }
                    
                }else {
                    at = at - t;
                    if (prod > at*bt) {
                        prod = at*bt;
                    }
                }
                at = a;
                bt = b;
                t = n;
                if (bt-y <= t) {
                    bt = y;
                    t = t - (b-y);
                    if (at-x <= t) {
                        at = x;
                        if (prod > at*bt) {
                            prod = at*bt;
                        }
                    }else {
                        at = at-t;
                        if (prod > at*bt) {
                            prod = at*bt;
                        }
                    }
                }else {
                    bt = bt - t;
                    if (prod > at*bt) {
                        prod = at*bt;
                    }
                }
                System.out.println(prod);
            }
        }
    }
}

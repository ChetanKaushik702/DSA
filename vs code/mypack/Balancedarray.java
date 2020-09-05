import java.util.Scanner;

public class Balancedarray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                if ((n/2) % 2 == 1) {
                    System.out.println("NO");
                    continue;
                }
                System.out.println("YES");
                int t = n/2;
                long k = 2;
                while (t-- > 0) {
                    System.out.print(k + " ");
                    k += 2;
                }
                t = n/2;
                long sum_even = (long)Math.pow(t, 2) + t; 
                k = 0;
                long i=1;
                while (t-- > 1) {
                    System.out.print(i + " ");
                    k += i;
                    i += 2;
                   
                }
                System.out.println(sum_even-k);
            }
        }
    }
}
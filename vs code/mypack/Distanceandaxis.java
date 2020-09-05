import java.util.Scanner;

public class Distanceandaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k > n) System.out.println(k-n);
            else if (n > k) {
                if (n % 2 == 1 && k % 2 == 0) System.out.println(1);
                else if (n % 2 == 0 && k % 2 == 1) System.out.println(1);
                else System.out.println(0);
            }   
            else System.out.println(0);
        }
        sc.close();
    }
}
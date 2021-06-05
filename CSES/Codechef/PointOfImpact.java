import java.util.Scanner;

public class PointOfImpact {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (y == x) System.out.println(n + " " + n);
                else if (y > x) {
                    int rem = k%4;
                    if (rem == 3) System.out.println((y-x) + " " + 0);
                    else if (rem == 1) System.out.println((x+n-y) + " " + n);
                    else if (rem == 2) System.out.println(n + " " + (x+n-y));
                    else System.out.println(0 + " " + (y-x));
                }else {
                    int rem = k%4;
                    if (rem == 3) System.out.println(0 + " " + (x-y));
                    else if (rem == 1) System.out.println(n + " " + (y+n-x));
                    else if (rem == 2) System.out.println((y+n-x) + " " + n);
                    else System.out.println((x-y) + " " + 0);
                }
            }
        }
    }
}

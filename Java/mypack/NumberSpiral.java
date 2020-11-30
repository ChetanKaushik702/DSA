import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long r = sc.nextLong();
                long c = sc.nextLong();
                if (r%2 == 1 && r >= c) System.out.println((r-1)*(r-1)+c);
                else if (r%2 == 0 && r >= c) System.out.println(r*r-c+1);
                else if (c%2 == 1 && c >= r) System.out.println(c*c-r+1);
                else if (c%2 == 0 && c >= r) System.out.println((c-1)*(c-1)+r);
            }
        }
    }
}
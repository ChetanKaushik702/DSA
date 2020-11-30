import java.util.Scanner;
public class WierdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 1) {
            System.out.print(n + " ");
            if ((n & 1) == 1) 
                n = 3*n + 1;
            else 
                n = n >> 1;
        }
        System.out.println(n);
        sc.close();
    }
}

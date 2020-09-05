import java.util.Scanner;

public class Locker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            long n = sc.nextLong();
            System.out.println((n*n*n + 5*n) / 6);
        }
    }
}

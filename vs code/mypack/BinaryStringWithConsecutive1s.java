import java.util.Scanner;

public class BinaryStringWithConsecutive1s {

    private static int countStrings(int n) {
        int[] a, b;
        a = new int[n];
        b = new int[n];
        a[0] = b[0] = 1;
        for (int i=1; i<n; i++) {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            System.out.println("Binary strings without consecutive 1's: " + countStrings(n));
            System.out.println("Binary strings without consecutive 1's: " + (int)(Math.pow(2, n) - countStrings(n)));
        }
    }
}

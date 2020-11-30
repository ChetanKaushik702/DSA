import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long minMoves = 0;
        a[0] = sc.nextLong();
        for (int i=1; i<n; i++) {
            a[i] = sc.nextLong();
            if (a[i] < a[i-1]) {
                minMoves += a[i-1] - a[i];
                a[i] = a[i-1];
            }
        }
        System.out.println(minMoves);
        sc.close();
    }
}

import java.util.Scanner;

public class CovidRun {
    private static String solve(int n, int k, int x, int y) {
        boolean isInfected = false;
        int t = x;
        if (x == y) isInfected = true;
        else
            while ((t+k) % n != x) {
                if ((t+k)%n == y) {
                    isInfected = true;
                    break;
                }
                t = (t+k) % n;
            }
        if (isInfected) return "YES";
        else    return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(solve(N, K, X, Y));
        }
    }
}

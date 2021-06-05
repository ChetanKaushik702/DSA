import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int q = sc.nextInt();
                int d[] = new int[n];
                while(q-- > 0) {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int val=1;
                    for (int i=l-1; i<r; i++) {
                        d[i] += val;
                        val++;
                    }
                }
                for(int x:d) System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}

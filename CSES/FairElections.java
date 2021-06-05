import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int a[] = new int[n];
                int b[] = new int[m];
                for (int i=0; i<n; i++)
                    a[i] = sc.nextInt();
                for (int i=0; i<m; i++)
                    b[i] = sc.nextInt();
                if (n*a[0] > m*b[0])    System.out.println(0);
                else {
                    if (n == m && n*b[0])
                }
            }
        }
    }
}
import java.util.Scanner;

public class HoroscopeMatrix {

    static String helper(int m[][], int x, int y) {
        boolean ans = true;
        return "Yes";
    }
    static void solver(int a[][], int n, int m) {
        int flag = 1;
        int i=0, j=0;
        for (int t=0; t<n; t++) {
            while (i < n-1 && j < m-1) {
                if (a[i][j] != a[i+1][j+1]) {
                    flag = 0;
                    break;
                }
                i++;
                j++;
            }
            if (flag == 0)  break;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int mat[][] = new int[n][m];
                for (int i=0; i<n; i++) {
                    for (int j=0; j<m; j++)
                        mat[i][j] = sc.nextInt();
                }
                int q = sc.nextInt();
                while(q-- > 0) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int v = sc.nextInt();
                    System.out.println(helper(mat, x, y));
                }
            }
        }
    }
}

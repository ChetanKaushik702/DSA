import java.util.Scanner;

public class IceWrapped {

    static void solver(int m[][], int i, int n, int num) {
        for (int k=i;k<n; k++) {
            m[k][i] = num;
            m[k][n-1] = num;
            m[i][k] = num;
            m[n-1][k] = num;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m[][] = new int[2*n-1][2*n-1];
            int num=n, i=0;
            for (int t=2*n-1; t>=1; t--) {
                solver(m, i, t, num);
                i++;
                num--;
            }
            for (int j=0; j<m.length; j++) {
                for (int k=0; k<m[j].length; k++)
                    System.out.print(m[j][k] + " ");
                System.out.println();
            }
        }
    }
}

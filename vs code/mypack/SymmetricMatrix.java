import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[2*n][2];
            for (int i=0; i<2*n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }

            if (m % 2 == 1)
                System.out.println("NO");
            else {
                int flag = 0;
                for (int i=0; i<2*n-1; i+=2) {
                    if (a[i][1] == a[i+1][0]) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) System.out.println("NO");
                else    System.out.println("YES");
            }
        }
        sc.close();
    }
}

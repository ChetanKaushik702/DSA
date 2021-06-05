import java.util.Scanner;

public class ArraySwaps {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            int flag = 0;
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                if (a[i] != 1)
                    flag = 1;
            }
            for (int i=0; i<m; i++) {
                b[i] = sc.nextInt();
                if (b[i] != 1)
                    flag = 1;
            }
            if (flag == 0)  System.out.println(0);
            
        }
    }
}

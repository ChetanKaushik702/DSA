import java.util.Scanner;
public class Alternating {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                int a[] = new int[N];
                for (int i=0; i<N; i++) a[i] = sc.nextInt();
                for (int i=0; i<N; i++) {
                    int val = 1;
                    for (int j=i; j<N-1; j++) {
                        if ((a[j] > 0 && a[j+1] < 0) || (a[j] < 0 && a[j+1] > 0)) 
                            val++;
                        else 
                            break;
                    }
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}

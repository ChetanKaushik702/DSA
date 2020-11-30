import java.util.Scanner;

public class FactorOrMultiple {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                int X = sc.nextInt();
                int []a = new int[N];
                for (int i=0; i<N; i++) a[i] = sc.nextInt();
                int count = 0, value = -1;
                for (int i=0; i<N; i++) {
                    if (a[i] % X == 0) {
                        count++;
                        if (count == 1) 
                            value = a[i];
                        else{
                            value = value | a[i];
                        }
                    }
                }
                if (count == 0) System.out.println(0);
                else System.out.println(value);
            }
        }
    }
}

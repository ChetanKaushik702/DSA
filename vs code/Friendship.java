import java.util.Arrays;
import java.util.Scanner;

public class Friendship {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int d[] = new int[N];
            for (int i=0; i<N; i++) d[i] = sc.nextInt();
            Arrays.sort(d);
            int duplicates = 0;
            for (int i=0; i<N-1; i++) 
                if (d[i] == d[i+1])
                    duplicates++;
            System.out.println(N-duplicates);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] in = new String[n];
            for (int i=0; i<n; i++) 
                in[i] = sc.nextLine();
            int ans = 1;
            for (int i=0; i<n-1; i++) {
                if (in[i].equals(in[i+1]))
                    continue;
                ans++;
            }
            System.out.println(ans);
        }
    }
}
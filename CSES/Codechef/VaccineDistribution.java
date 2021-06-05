package Codechef;

import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int risky = 0;
            for (int i=0; i<n; i++) {
                int age = sc.nextInt();
                if (age <= 9 || age >= 80)
                    risky++;
            }
            if (d == 1) System.out.println(n);
            else {
                int ans = 0;
                if (risky%d == 0) ans += risky/d;
                else    ans += risky/d + 1;
                if ((n-risky)%d == 0) ans += (n-risky)/d;
                else    ans += (n-risky)/d + 1;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}

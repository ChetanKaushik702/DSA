package Codechef;
import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int ans = 0;
                int f[] = new int[n];
                for (int i=1; i<=n; i++) {
                    f[i-1] = sc.nextInt();
                }
                int fuel = f[0];
                for (int i=1; i<n; i++) {
                    if (fuel >= 1) {
                        ans = ans+1;
                        fuel = fuel -1 + f[i];
                    }else
                        break;
                }
                ans = ans+fuel;
                System.out.println(ans);
            }
        }
    }    
}

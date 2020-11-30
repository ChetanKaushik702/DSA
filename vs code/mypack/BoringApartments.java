import java.util.Scanner;

public class BoringApartments {
    private static void solve(int n) {
        int ans=0;
        int d = n%10;
        switch(d) {
            case 1:
                ans = 0;
                for (int i=1; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            
            case 2:
                ans = 10;
                for (int i=2; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 3:
                ans = 20;
                for (int i=3; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 4:
                ans = 30;
                for (int i=4; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 5:
                ans = 40;
                for (int i=5; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 6:
                ans = 50;
                for (int i=6; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 7:
                ans = 60;
                for (int i=7; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 8:
                ans = 70;
                for (int i=8; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
            case 9:
                ans = 80;
                for (int i=9; i<=n;) {
                    ans = ans + (int)Math.log10(i) + 1;
                    i = 10*i + i%10; 
                }
            break;
        } 
        System.out.println(ans);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                solve(N);
            }
        }
    }
}

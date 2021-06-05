import java.util.Scanner;

public class SwapAndEquate {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.next();
                String p = sc.next();
                int count_1_s=0, count_1_p=0;
                for (int i=0; i<n; i++) {
                    if (s.charAt(i) == '1') count_1_s++;
                    if (p.charAt(i) == '1') count_1_p++;
                }
                boolean good = count_1_s == count_1_p;
                count_1_s=count_1_p=0;
                for (int i=0, pref=0; i<n; i++) {
                     if (s.charAt(i) == '1')    count_1_s++;
                     if (p.charAt(i) == '1')    count_1_p++;
                     pref += count_1_s - count_1_p;
                     good &= pref >= 0;
                }
                if (good)   System.out.println("Yes");
                else    System.out.println("No");
            }
        }
    }
}

import java.util.Scanner;
public class Singlepush {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a, b;
            a = new int[n];
            b = new int[n];
            for (int i=0; i<n; i++) a[i] = sc.nextInt();
            for (int i=0; i<n; i++) b[i] = sc.nextInt();
            
            int flag = 1, diff = 0;
            boolean zero = false;
            for (int i=0; i<n; i++) {
                if (a[i] == b[i] && diff == 0)
                    continue;
                else {
                    if (a[i] == b[i]) {
                        zero = true;
                        continue;
                    }
                    if (diff == 0)
                        diff = a[i]-b[i];
                    if (diff > 0) {
                        flag = 0;
                        break;
                    }
                    if (a[i]-b[i] != diff) {
                        flag = 0;
                        break;
                    }
                    if (a[i] != b[i] && diff != 0 && zero) {
                        flag = 0;
                        break;
                    }
                }
            }
            if (flag == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class Permute {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int pos = -1;
                for (int i=0; i<n; i++) {
                    a[i] = sc.nextInt();
                    if (a[i] == 1) 
                        pos = i;
                }
                boolean cl = true, a_cl = true;
                for (int i=1; i<n; i++) {
                    cl = cl & (a[(pos - i + n) % n] == i+1);
                    a_cl = a_cl & (a[(pos + i + n) % n] == i+1);
                }
                if (cl || a_cl) System.out.println("YES");
                else System.out.println("NO");
        }
        sc.close();
    }
}

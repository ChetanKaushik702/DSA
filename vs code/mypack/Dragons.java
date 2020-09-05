import java.util.Scanner;
public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a, b;
        a = new int[k];
        b = new int[k];
        boolean [] c = new boolean[k];
        for (int i=0; i<k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        } 
        int t = k;
        while (t-- > 0) {
            for (int i=0; i<k; i++) 
                if (n > a[i] && c[i] == false) {
                    n = n + b[i];
                    c[i] = true;
                    break;
                }
        }
        int flag = 1;
        for (int i=0; i<k; i++) 
            if (c[i] == false) {
                flag = 0;
                break;
            }
        if (flag == 1) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }
}
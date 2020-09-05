import java.util.Scanner;
public class Ternarysequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int [] a, b;
            a = new int[3];
            b = new int[3];
            for (int i=0; i<3; i++) a[i] = sc.nextInt();
            for (int i=0; i<3; i++) b[i] = sc.nextInt();
            int sum = 2*Math.min(a[2], b[1]), t = b[1];
            b[1] -= Math.min(a[2], b[1]);
            a[2] -= Math.min(a[2], t);

            t = b[2];
            b[2] -= Math.min(a[2], b[2]);
            a[2] -= Math.min(a[2], t);
            
            t = b[2];
            b[2] -= Math.min(a[0], b[2]);
            a[0] -= Math.min(a[0], t);

            t = b[1];
            b[1] -= Math.min(a[0], b[1]);
            a[0] -= Math.min(a[0], t);

            t = b[1];
            b[1] -= Math.min(a[1], b[1]);
            a[1] -= Math.min(a[1], t);

            sum -= 2*Math.min(b[2], a[1]);
            
            System.out.println(sum);
        }
        sc.close();
    }
}
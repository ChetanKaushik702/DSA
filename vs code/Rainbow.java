import java.util.Scanner;
public class Rainbow {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
            boolean flag = true;
            if (N%2 != 0) {
                for (int i=0; i<a.length/2-1; i++) {
                    if (a[i] != a[a.length-i-1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag && a[a.length/2] == 7) System.out.println("yes");
                else System.out.println("no"); 
            }else System.out.println("no");
        }
        sc.close();
    }
}

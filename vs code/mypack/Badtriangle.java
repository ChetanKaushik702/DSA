import java.util.Scanner;
public class Badtriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
                long min_sum = a[0] + a[1];
                int flag=0, j=2;
                for (; j<a.length; j++) 
                    if (min_sum <= a[j]) {
                        flag = 1;
                        break;
                    }

                if (flag == 1) System.out.println("1 2 " + (j+1));
                else System.out.println(-1); 
            }
        }

    }
}
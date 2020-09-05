//import java.util.Arrays;
import java.util.Scanner;

public class Maria {
    public static void main(String[] args) {
        // try (Scanner sc = new Scanner (System.in)) {
        //     int T = sc.nextInt();
        //     while (T-- > 0) {
        //         int n = sc.nextInt();
        //         int[] a = new int[n];
        //         for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
        //         Arrays.sort(a);
        //         int flag = 1;
        //         for (int i=a.length-1; i>=0; i--) 
        //             if (a[i] <= i+1) {
        //                 flag = i+2;
        //                 break;
        //             }
        //         if (flag == 1)
        //             System.out.println(1);
        //         else
        //             System.out.println(flag);
        //     }
        // }
        // System.out.println(Math.log(10)/Math.log(2));
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int ans= 0;
        while (x != 0) {
            if ((x & 1) != 0) ans++;
            x = x >> 1;
        }
        System.out.println(ans);
        sc.close();
    }
}

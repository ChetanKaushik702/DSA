import java.util.Scanner;
public class Colorballs {

    public static void main(String[] args) {
        var sc = new Scanner (System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int [] a = new int[4];
            int evens_3 = 0, evens_1 = 0;
            for (int i=0; i<4; i++) {
                 a[i] = sc.nextInt();
                if (i < 3 && a[i] % 2 == 0)
                    evens_3++;
                else if (a[i] % 2 == 0 && i == 3)
                        evens_1++;
            }
            boolean cond1 = a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0;
            boolean cond2 = (a[0] == 0 || a[0] == 1) && (a[1] == 0 || a[1] == 1) && (a[2] == 0 || a[2] == 1) && (a[3] == 0 || a[3] == 1) ;
            
            if (cond1)  System.out.println("YES");
            else if (cond2 && !cond1) System.out.println("NO");
            else {
                if (evens_3 == 3 || evens_3 == 0) System.out.println("YES");
                else if ((evens_3 == 2 && evens_1 == 1) || (evens_3 == 1 && evens_1 == 0))  System.out.println("YES");
                else System.out.println("NO");
            }
        }

        sc.close();
    }
}
package Codechef;

import java.util.Scanner;

public class XorComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int ans = 0;
            if (x ==  0 && y == 0)  System.out.println(0);
            else {
                for (int z=0; z<=n; z++) {
                    if ((x^z) < (y^z)) {
                        System.out.println(x+","+z + "\t" + y + ","+z);
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}

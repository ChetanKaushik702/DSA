package Codechef;
import java.util.*;

class Code {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int a[] = new int[n];
                for (int i=0; i<n; i++) a[i] = sc.nextInt();
                Arrays.sort(a);
                int sum = 0;
                int flag = 0, i;
                if (a[a.length-1] > k) {sum = k; n-=1;}
                for (i=n-1; i>=0; i--) {
                    sum+=a[i];
                    if (sum >= 2*k) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)  System.out.println(-1);
                else System.out.println(a.length-i);
            }
        }
    }
}
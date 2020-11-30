import java.util.Scanner;

public class CubesSorting {

    private static int isSorted(int a[]) {
        int flag = 1;
        for (int i=1; i<a.length; i++)
            if (a[i] < a[i-1]) {
                flag = 0;
                break;
            }
        
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i=0; i<n; i++)
                a[i] = sc.nextInt();
            int maxOp = n*(n-1)/2 -1;
            int op=0;
            outer: while (op <= maxOp) {
                for (int j=1; j<n; j++) {
                    if (a[j] < a[j-1]) {
                        op++;
                        if (op > maxOp)
                            break outer;
                        a[j] = a[j] + a[j-1];
                        a[j-1] = a[j] - a[j-1];
                        a[j] = a[j] - a[j-1];
                    }
                }
                if (isSorted(a) == 1)
                    break;
            }
            if(isSorted(a) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

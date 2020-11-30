import java.util.Scanner;

public class SwapBits {

    private static int findHighest(int a[]) {
        int b = 0, e = a.length-1;
        while (b <= e) {
            int m = (b + e) / 2;
            if (m == 0 || m == a.length-1 || (a[m] > a[m+1] && a[m] > a[m-1]))
                return a[m];
            else if (a[m] < a[m+1])
                    b = m+1;
            else if (a[m] < a[m-1])
                    e = m-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            
            System.out.println(findHighest(a));
        }
        sc.close();
    }
}

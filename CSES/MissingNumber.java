import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n-1; i++) {
            int v = sc.nextInt();
            a[v-1] += 1;
        }
        for (int i=1; i<=n; i++) 
            if (a[i-1] == 0) {
                System.out.println(i);
                break;
            }
        sc.close();
    }
}

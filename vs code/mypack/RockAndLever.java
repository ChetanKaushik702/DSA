import java.util.Scanner;

public class RockAndLever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            int pairs = 0;
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    if ((a[i] & a[j]) >= (a[i] ^ a[j]))
                        pairs++;
                }
            }
            System.out.println(pairs);
        }
        sc.close();
    }
}

import java.io.*;
import java.util.*;
public class CodeChef {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String [] s = br.readLine().split(" ");
            int sum = 0;
            for (int i=0; i<n; i++) {
                a[i] = Integer.parseInt(s[i]);
                sum += a[i];
            }
            Arrays.sort(a);
            int money = 0, count = 0;
            for (int i=n-1; i>=0 ; i--) {
                money += a[i];
                sum -= a[i];
                count++;
                if (money > sum)
                    break;
            }
            System.out.println(count);
        }
    }
}

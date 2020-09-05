import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        var ls = new ArrayList<Integer>();
        for (int i=0; i<n-1; i++) {
            if (a[i] == a[i+1]) {
                int duplicate = 1;
                for (int j=i+1; j<n-1; j++) {
                    if (a[j+1] == a[j])
                        duplicate++;
                    else
                        break;
                }
                ls.add(duplicate+1);
            }
        }
        if (ls.size() > 0)
            System.out.println(Collections.max(ls) + " " + (a.length - ls.size()));
        else
            System.out.println("1 " + a.length);
        sc.close();
    }
}

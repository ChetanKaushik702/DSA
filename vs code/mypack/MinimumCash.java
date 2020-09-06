import java.util.Hashtable;
import java.util.Scanner;
public class MinimumCash {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for (int i=0; i<n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            int max = 1;
            boolean b[] = new boolean[n];
            for (int i=0; i<n-1; i++) {
                int count = 1;
                if (!b[i]) {
                    for (int j=i+1; j<n; j++) {
                        if (a[i][0] == a[j][0] && a[i][1] == a[j][1]) {
                            b[j] = true;
                            count++;
                        }
                    }
                if (count > max)
                    max = count;
                b[i] = true;
                }
            }
            System.out.println(max);
            // Hashtable<Integer, Integer> ht1, ht2;
            // ht1 = new Hashtable<>();
            // ht2 = new Hashtable<>();
            // ht1.put(sc.nextInt(), sc.nextInt());
            // for (int i=1; i<n; i++) {
            //     int k = sc.nextInt();
            //     int v = sc.nextInt();
            //     if (ht1.containsKey(k) && ht1.containsValue(v)) {
            //         int v2;
            //         if (ht2.isEmpty() || !ht2.containsKey(k)) {
            //             v2 = v;
            //             ht2.put(k, v2+1);
            //         }
            //         else if (ht2.containsKey(k)) {
            //             v2 = ht2.get(k);
            //             ht2.put(k, v2+1);
            //         } 
            //     }else {
            //         ht1.put(k, v);
            //     }
            // }
            // System.out.println(ht1);
            // System.out.println(ht2);
        }
    }
}
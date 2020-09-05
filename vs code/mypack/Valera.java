import java.util.ArrayList;
import java.util.Scanner;
public class Valera {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int v = sc.nextInt();
            var q = new ArrayList<Integer>();
            for (int i=0; i<n; i++) {
                int k = sc.nextInt();
                for (int j=0; j<k; j++) {
                    int s = sc.nextInt();
                    if (s < v) {
                        q.add(k);
                    }
                }
            }
            System.out.println(q.size());
            for (int x:q) System.out.print(x + " ");
        }
    }    
}

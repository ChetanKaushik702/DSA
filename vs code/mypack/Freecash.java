import java.util.Hashtable;
import java.util.Scanner;

public class Freecash {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int min = 1;
        int minCash = 1;
        ht.put(sc.nextInt(), sc.nextInt());
        for (int i=1; i<n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            if (ht.containsKey(key) && ht.containsValue(value))
                minCash++;
            else {
                if (min < minCash) 
                    min = minCash;
                minCash = 1;
                ht.put(key, value);
            }
        }
        System.out.println(min);
        sc.close();
    }
}

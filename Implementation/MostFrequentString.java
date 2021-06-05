import java.util.Hashtable;
import java.util.Scanner;

public class MostFrequentString {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            String list[] = new String[n];
            for (int i = 0 ; i < n ; i++)   list[i] = sc.next();

            Hashtable<String, Integer> ht = new Hashtable<>();
            for (int i = 0 ; i < n ; i++) {
                if (ht.containsKey(list[i])) {
                    int value = ht.get(list[i]);
                    ht.put(list[i], value + 1);
                }
                else {
                    ht.put(list[i], 1);
                }
            }
            // System.out.println(ht);
            int j = 0, maxFreq = 0, ind = -1;
            while (j < n) {
                // System.out.print(ht + "\t");
                if (maxFreq <= ht.get(list[j])) {
                    ind = j;
                    maxFreq = ht.get(list[j]);
                }
                // System.out.println(maxFreq);
                int val = ht.get(list[j]);
                ht.put(list[j], val - 1);
                
                j++;
            }

            // System.out.println(ht);
            System.out.println(list[ind]);
        }
    }
}

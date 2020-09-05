import java.util.*;
public class Sortusingkeys {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int k =sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0; i<k; i++) 
                map.put(sc.nextInt(), sc.nextInt());
            // System.out.println(n);
            // System.out.println(map);
            TreeMap<Integer, Integer> sorted = new TreeMap<>(map);
            int flag = 1;
            System.out.println(map);
            for (Map.Entry<Integer, Integer> entry: sorted.entrySet()) {
                if (entry.getKey() >= n) {
                    flag = 0;
                    break;
                }
                n += entry.getValue();
            }
            if (flag == 1) System.out.println("YES");
            else    System.out.println("NO");
        }
    }
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WannaBeTheGuy {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            Set<Integer> s_X = new HashSet<>();
            while (x-- > 0) {
                s_X.add(sc.nextInt());
            }
            int y = sc.nextInt();
            Set<Integer> s_Y = new HashSet<>();
            while (y-- > 0) {
                s_Y.add(sc.nextInt());
            }
           s_X.addAll(s_Y); 
            if (s_X.size() == n)
                System.out.println("I become the guy.");
            else
                System.out.println("Oh, my keyboard!"); 
        }
    }
}
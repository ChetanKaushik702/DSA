import java.util.HashSet;
import java.util.Scanner;

public class HelpSanta {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i=0; i<n; i++) {
                int v = sc.nextInt();
                set.add(v);
            }
            for (int i=1; i<=set.size(); i++)
                System.out.print(i +" ");
            System.out.println();
        }
    }
}

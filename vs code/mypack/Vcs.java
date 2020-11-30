import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            //int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            Set<Integer> setM = new HashSet<>();
            Set<Integer> setK = new HashSet<>();
            for (int i=0; i<M; i++) 
                setM.add(sc.nextInt());
            for (int i=0; i<K; i++)
                setK.add(sc.nextInt());

        }
        sc.close();
    }
}

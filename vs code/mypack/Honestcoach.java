import java.util.*;
public class Honestcoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int min = 1001;
            for (int i=0; i<a.length-1; i++) {
                int d = Math.abs(a[i] - a[i+1]);
                if (d < min) 
                    min = d;
            } 
            System.out.println(min);
        }
        sc.close();
    }
}
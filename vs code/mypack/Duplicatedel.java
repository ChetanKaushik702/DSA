import java.util.*;

public class Duplicatedel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0; i<n; i++) a[i] = sc.nextInt();

            // TC: O(n), SC: O(n) 
            Set<Integer> set = new LinkedHashSet<>();
            for (int i=0; i<n; i++) 
                set.add(a[i]);
            
            Iterator<Integer> itr = set.iterator();
            while(itr.hasNext()) System.out.print(itr.next() + " ");

            // Prerequisite: array must be sorted
            Arrays.sort(a); // O(nlogn)
            // SC: O(1) TC: O(n^2)
            for (int i=0; i<n-1; i++) {
                if (a[i] == a[i+1]) {
                    for (int j=i+1; j<n-1; j++) 
                        a[j] = a[j+1];
                    i--;
                    n--;
                }
            }
            System.out.println();
            for (int i=0; i<n; i++) System.out.print(a[i] + " ");

        }
    }
}
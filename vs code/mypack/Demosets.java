import java.io.*;
import java.util.*;
public class Demosets {
    public static void main(String[] args) throws IOException {
        // long beg = System.currentTimeMillis();
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     int T = Integer.parseInt(br.readLine());
        //     while (T-- > 0) {
        //         int n = Integer.parseInt(br.readLine());
        //         int[] a = new int[2*n];
        //         var st = new StringTokenizer(br.readLine());
        //         int i = 0;
        //         while (st.hasMoreTokens()) 
        //             a[i++] = Integer.parseInt(st.nextToken()); 
        //         int ans[] = new int[n];
        //         ans[0] = a[0];
        //         i=1;
        //         for (int j=1; j<a.length; j++) {
        //             int flag = 1;
        //             for (int k=0; k<ans.length; k++)
        //                 if (a[j] == ans[k]) {
        //                     flag = 0;
        //                     break;
        //                 }
        //             if (flag == 1) {
        //                 ans[i] = a[j]; 
        //                 i++;
        //             }
        //             if (i == n) 
        //                 break;
                    
        //         }
        //         for (int x:ans) System.out.print(x + " ");
        //         System.out.println();
        //     }
        // }
        // long end = System.currentTimeMillis();
        // System.out.println("BufferedReader: " + (end-beg));
        long beg = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            //int a[] = new int[2*n];
            Set<Integer> set = new LinkedHashSet<>();
            for (int i=0; i<2*n; i++) 
                set.add(sc.nextInt());
            Iterator<Integer> itr = set.iterator();
            while (itr.hasNext()) 
                System.out.print(itr.next() + " ");
            System.out.println();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end-beg));
        sc.close();
    }
}
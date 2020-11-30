import java.util.*;
public class PenaltyShootout {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int N = sc.nextInt();
            // while (T-- > 0) {
            //     int N = sc.nextInt();
            //     sc.nextLine();
            //     int [] a;
            //     a = new int[2*N];
            //     String in = sc.nextLine();
            //     for (int i=0; i<2*N; i++) {
            //         a[i] = (int) (in.charAt(i) - 48);
            //     }
            //     int A = 0, B = 0, i, sA = N, sB = N;
            //     for (i=0; i<2*N; i++) {
            //        if (i%2 == 0) {
            //            A = A + a[i];
            //            sA--;
            //        }else {
            //            B = B + a[i];
            //            sB--;
            //        }
            //        if (A > (sB + B) || B > (A + sA)) {
            //            sB = i+1;
            //            break;
            //        }
            //     }
            //     if (sB == 0) System.out.println(2*N);
            //     else System.out.println(sB);
            // }
            // Set<Integer> C = new HashSet<>();
            // for (int i=0; i<T-1; i++)
            //     C.add(sc.nextInt());
            // int i=1;
            // while (i < T) {
            //     if (!C.contains(i))
            //         break;
            //     i++;
            // }
            // System.out.println(i);
            int D = sc.nextInt();
            int a[] = new int[N];
            for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
            // while (N-- > 0) {
            //     int key = a[0];
            //     for (int i=0; i<T-1; i++)
            //         a[i] = a[i+1];
            //     a[T-1] = key;
            // }
            if (D == N)
                for (int x:a) System.out.print(x + " ");
            else {
                for (int i=D; i<a.length; i++)
                    System.out.print(a[i] + " ");
                for (int i=0; i<D; i++)
                    System.out.print(a[i] + " ");
            }
        }
    }
}
import java.io.*;
import java.util.*;

public class WatchingCPL {

    static int solver(int h[], int k, int i) {
        // int h[] = new int[H.length];
        // for (int p=0; p<H.length; p++)  h[p] = H[p];
        boolean flag=false;
        int sum_a=0;
        while(i < h.length) {
            sum_a += h[i];
            if (sum_a >= k) {
                flag = true;
                break;
            }
            int ind=i+1;
            for (int j=i+1; j<h.length; j++) {
                if (h[j] >= k-sum_a)
                    ind = j;
            }
            if (ind != i+1) {
                //swap h[ind] and h[i+1]
                int temp = h[i+1];
                h[i+1] = h[ind];
                h[ind] = temp;
                for (int x:h)   System.out.print(x+ " ");
                System.out.println();
            }
            i+=1;
        }
        if (flag) return i+1;
        else    return -1;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0) {
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                s = br.readLine().split(" ");
                int h[] = new int[n];
                int sum=0;
                for (int i=0; i<n; i++) {
                    h[i] = Integer.parseInt(s[i]);
                    sum += h[i];
                }
                if (sum < 2*k)  System.out.println(-1);
                else {
                    Arrays.sort(h);
                    int H[] = new int[n];
                    for (int i=0; i<n; i++)
                        H[i] = h[n-i-1];
                    int ans;
                    int val = solver(H, k, 0);
                    if (val != -1) {
                        ans=val;
                        val = solver(H, k, val);
                        if (val != -1) {
                            ans = val;
                            System.out.println(ans);
                        }
                        else
                            System.out.println(-1);
                    }else
                        System.out.println(-1);
                }

            }
        }
    }
}

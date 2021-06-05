import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String s = br.readLine();
                int a[] = new int[26];
                for (int i=0; i<s.length(); i++) {
                    a[s.charAt(i)-65]++;
                }
                int pairs=0;
                for (int i=0; i<26; i++) {
                    if (a[i]>1)
                        pairs += a[i]/2;
                }
                int rem = s.length()-pairs;
                if (rem >= pairs)   System.out.println(pairs);
                else {
                    if (pairs > 1) {
                        if (pairs%2 == 1)   System.out.println(pairs/2+1);
                        else    System.out.println(pairs/2);
                    }else System.out.println(0);
                }
            }
        }
    }
}
package Codechef;
import java.io.*;

public class CatchtheTheif {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0) {
               String[] s = br.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                int k = Integer.parseInt(s[2]);
                //int n = Integer.parseInt(s[3]);

                int d = Math.abs(x-y);
                if (d%k == 0) {
                    if ((d/k)%2 == 0)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }else 
                    System.out.println("No");
            }
        }    
    }
}

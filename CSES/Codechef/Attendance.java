package Codechef;
import java.io.*;

public class Attendance {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String b = br.readLine();
                int att = 120-n;
                for (int i=0; i<b.length(); i++) {
                    if (b.charAt(i) == '1')
                        att++;
                }
                if (att >= 90)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}

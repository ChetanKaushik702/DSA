import java.io.*;
public class Codeforces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(br.readLine());
        s.reverse();
        String rev_s = new String(s);
        String t = br.readLine();
        if (rev_s.equals(t)) System.out.println("YES");
        else System.out.println("NO");
        
        br.close();
    }
}
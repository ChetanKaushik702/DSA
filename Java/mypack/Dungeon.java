import java.io.*;
public class Dungeon {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0) {
                 String[] s = br.readLine().split(" ");
                 int sum = 0;
                 sum += Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]);
                 if (sum%9 != 0)    System.out.println("No");
                 else   System.out.println("Yes");
            }
        }
    }
}
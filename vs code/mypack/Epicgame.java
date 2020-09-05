import java.io.*;
import java.util.StringTokenizer;

public class Epicgame {
    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        while (1 > 0) {
            int Sim = gcd(n, a);
            n = n-Sim;
            if (n == 0) {
                System.out.println("0");
                break;
            }
            int Asim = gcd(n, b);
            n = n-Asim;
            if(n == 0) {
                System.out.println("1");
                break;
            }
        }
        br.close();
    }
}
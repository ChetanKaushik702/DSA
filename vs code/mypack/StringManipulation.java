import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation {

    private static String arangeDescending(String s, int N, int M) {
        char c[] = new char[s.length()];
        c = s.toCharArray();
        
        // insertion sort
        for (int i=N+1; i<=M; i++) {
            char key = c[i];
            int j = i-1;
            while (j >= N && key > c[j]) {
                c[j+1] = c[j];
                j--;
            }
            c[j+1] = key;
        }

        return new String(c);
    }

    private static String shiftedString(String s, int K) {
        char toRet[] = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            int itr = (i + K) % s.length();
            toRet[itr] = s.charAt(i);
        }
        return new String(toRet);
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                String input = br.readLine();
                String[] str = input.split(" ");
                String s = str[0];
                int N = Integer.parseInt(str[1]);
                int M = Integer.parseInt(str[2]);
                int K = Integer.parseInt(str[3]);
                System.out.println(arangeDescending(s, N, M));
                System.out.println(shiftedString(s, K));
            }
        }
    }
}

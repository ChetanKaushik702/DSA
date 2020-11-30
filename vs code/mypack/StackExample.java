import java.io.*;
import java.util.ArrayDeque;
public class StackExample {

    private static void maxDepth(String s) {
        int max = 1, index = 0;
        for (int i=0; i<s.length(); i++) {
            int temp = 1;
            int in = i;
            if (s.charAt(i) == '(') {
                for (int j=i+1; j<s.length(); j++) {
                    if (s.charAt(j) == '(') 
                        temp++;
                    else {
                        in = j;
                        break;
                    }
                }
                if (max < temp) {
                    max = temp;
                    index = in;
                    i = i + 2*temp - 1;
                }
            }
        }
        System.out.println(max + " " + index);
        maxSymbol(s);
    }

    private static void maxSymbol(String s) {
        ArrayDeque<Character> stck = new ArrayDeque<>();
        int flag = 1;
        int max = 1, index = 0, j = 0, k = 0;;
        for (int i=0; i<s.length(); i++) {
            if (flag == 1) {
                k = i;
                flag = 0;
            }
            if (s.charAt(i) == '(')
                stck.push(s.charAt(i));
            else {
                stck.pop();
                j = j + 2;
            }
            if (stck.isEmpty()) {
                if (max < j) {
                    max = j;
                    index = k+1;
                }
                flag = 1;
                j = 0;
            }
        }
        System.out.println(max + " " + index);
    }
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String exp = br.readLine();
            maxDepth(exp);
        }
    }
}

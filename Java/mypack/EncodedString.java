import java.util.*;

public class EncodedString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            Hashtable<String, Character> ht = new Hashtable<>();
            ht.put("0000", 'a'); ht.put("0001", 'b'); ht.put("0010", 'c'); ht.put("0011", 'd');
            ht.put("0100", 'e'); ht.put("0101", 'f'); ht.put("0110", 'g'); ht.put("0111", 'h');
            ht.put("1000", 'i'); ht.put("1001", 'j'); ht.put("1010", 'k'); ht.put("1011", 'l');
            ht.put("1100", 'm'); ht.put("1101", 'n'); ht.put("1110", 'o'); ht.put("1111", 'p');
            while (t-- > 0) {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.next();
                int i=0;
                String ans = "";
                while (i < n) {
                    /*i=0 j=0 to 3
                      i=4 j=4 to 7
                      i=8 j=8 to 11
                      i=12 */
                    String encod = "";
                    for (int j=i; j<=i+3; j++)
                        encod += s.charAt(j);
                    i += 4;
                    ans += ht.get(encod);
                }
                System.out.println(ans);
            }
        }
    }
}

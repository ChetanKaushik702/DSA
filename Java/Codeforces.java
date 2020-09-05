import java.util.*;
public class Codeforces {
    static private boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
                ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
                ? true : false;
    }
    
    static private String res_Str(String in) {
        char[] c = new char[in.length()];
        c = in.toCharArray();
        ArrayList<Character> c_list = new ArrayList<Character>();
        for (int i=0; i<c.length; i++) {
            if (!isVowel(c[i]) && (c[i] >= 'B' && c[i] <='Z')){
                c_list.add('.');
                c_list.add((char)(c[i] + 32));
            }
            else if (!isVowel(c[i])){
                c_list.add('.');
                c_list.add(c[i]);
            }
        }
        char[] ch = new char[c_list.size()];
        for (int i=0; i<c_list.size(); i++) ch[i] = c_list.get(i);
        return new String(ch);
    } 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(res_Str(s));
        sc.close();
    }
}
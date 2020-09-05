import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char ch[] = new char[4];
        int i=0, x = Math.abs(n);

        while(x != 0) {
            if(n < 0) {
                ch[0] = '-';
                ch[3-i++] =  (char)(x % 10 + 48);
                //System.out.println(ch[4-i]);
            }else {
                ch[2-i++] = (char)(x % 10 + 48);
                //System.out.println(ch[3-i]);
            }
            x /= 10;
        }
        String s = new String(ch);
        System.out.println(s);
        
    }
}
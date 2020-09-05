import java.util.Scanner;

public class Capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int flag = 1;
        for (int i=1; i<s.length(); i++) 
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                flag = 0;
                break;
            }
        if (flag == 0)  System.out.println(s);
        else {
            if (s.charAt(0) >= 'A' && s.charAt(0) <='Z')
                flag = 0;
            s = s.toLowerCase();
            char[] ans = s.toCharArray();
            if (flag == 1)
                ans[0] = (char)(ans[0] - 32);
            System.out.println(new String(ans));
        }
        sc.close();
    }
}
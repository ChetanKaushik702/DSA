import java.util.Scanner;

public class Shapur {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String out = "";
            for (int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    out = out + "1";
                else 
                    out = out + "0";
            }
            System.out.println(out);
        }
    }
}
import java.util.Scanner;

public class Jeff {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();
        while (N-- > 0) {
            String w = sc.nextLine();
            int flag = 1;
            for (int i=0; i<w.length(); i++) {
                int found = 0;
                for (int j=0; j<s.length(); j++) {
                    if (w.charAt(i) == s.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}

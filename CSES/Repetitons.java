import java.util.Scanner;

public class Repetitons {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int max = 1, temp = 1;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                temp++;
                if (max < temp)
                    max = temp;
            }
            else 
                temp = 1;
        }
        System.out.println(max);
        sc.close();
    }
}

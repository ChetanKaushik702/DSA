import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (2*l > r) System.out.println("-1 -1");
            else System.out.println(l + " " + 2*l);
        }
        // float a = 200, c = 3; 
        // float b = a / c;
        // System.out.println(b);
        sc.close();
    }
}
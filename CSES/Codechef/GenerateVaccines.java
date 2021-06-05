package Codechef;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int v1 = sc.nextInt();
        int d2 = sc.nextInt();
        int v2 = sc.nextInt();
        int p = sc.nextInt();

        // d1 == d2
        if (d1 == d2) {
            if (p%(v1+v2) == 0) System.out.println(d1 + p/(v1+v2) - 1);
            else System.out.println(d1 + p/(v1+v2));
        }else if (d1 > d2) {
            int p_temp = p - (d1-d2)*v2;
            // d2 meets the need for vaccines within d1-d2 days
            if (p_temp == 0)    System.out.println(d1 - 1);
            else if (p_temp < 0) {
                if (p%v2 == 0)  System.out.println(d2 + p/v2 - 1);
                else System.out.println(d2 + p/v2);
            }else { 
                if (p_temp%(v1+v2) == 0)  System.out.println(d1 + p_temp/(v1+v2) - 1);
                else System.out.println(d1 + p_temp/(v1+v2));
            }
        }else {
            int p_temp = p - (d2-d1)*v1;
            // d1 meets the need for vaccines within d2-d1 days
            if (p_temp == 0)    System.out.println(d2 - 1);
            else if (p_temp < 0) {
                if (p%v1 == 0)  System.out.println(d1 + p/v1 - 1);
                else System.out.println(d1 + p/v1);
            }else { 
                if (p_temp%(v1+v2) == 0)  System.out.println(d2 + p_temp/(v1+v2) - 1);
                else System.out.println(d2 + p_temp/(v1+v2));
            }
        }
        sc.close();
    }
}
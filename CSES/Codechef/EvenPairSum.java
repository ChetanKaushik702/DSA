package Codechef;

import java.util.Scanner;

public class EvenPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if (a%2 == 0){
                if (b%2 == 0)   System.out.println(a/2 * b);
                else    System.out.println(a/2 * (b/2+1) + (a/2) * (b/2));
            }
            else {
                if (b%2 == 0) System.out.println(b/2 * (a/2+1) + (a/2)*(b/2));
                else    System.out.println((a/2+1)*(b/2+1) + (a/2)*(b/2));
            }
        }
        sc.close();
    }
}

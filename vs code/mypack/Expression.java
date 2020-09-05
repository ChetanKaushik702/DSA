import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int v1 = a+b*c;
        int v2 = (a+b)*c;
        int v3 = a*b*c;
        int v4 = a*(b+c);
        int v5 = a+b+c;
        v1 = Math.max(v1, v2);
        v2 = Math.max(v1, v3);
        v3 = Math.max(v2, v4);
        v4 = Math.max(v3, v5);
        System.out.println(v4);
        sc.close();
    }
}
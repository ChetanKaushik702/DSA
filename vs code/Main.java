import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = "2";
        BigInteger C = new BigInteger(n);
        BigInteger A = new BigInteger(s);
        s = sc.nextLine();
        BigInteger B = new BigInteger(s);
        System.out.println(A.add(B).divide(C) + "\n" + A.subtract(B).divide(C));
        sc.close(); 
    }
}
import java.util.Scanner;

public class NthRootOfaNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a non-negative number: ");
            double num = sc.nextDouble();
            System.out.print("Enter n: ");
            double n = sc.nextDouble();
            double ans = Math.exp(Math.log(num)/n);
            System.out.println(n + "th root of " + num + " is " + ans);
        }
    }
}
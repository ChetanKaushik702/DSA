import java.util.Scanner;

public class AlgorithmicDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        long beg = System.currentTimeMillis();
        for (int i=1; i<=Math.pow(9, n); i++)
            result *= 9;
        long end = System.currentTimeMillis();
        sc.close();
        System.out.println("time in milli seconds: " + (end-beg));
        System.out.println(result);

    }
}
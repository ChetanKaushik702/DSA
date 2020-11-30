import java.util.Scanner;

public class SetBit {
    
    private static int findPosition(int N) {
        if (N == 1)
            return 1;
            int x = 1, bitOn = 1;
            while (true) {
                x = x << 1;
                bitOn++;
                if (x == N) {
                    return bitOn;
                }
                if (x > N) {
                    return -1;
                }
            }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                System.out.println(findPosition(N));
            }
        }
    }
}

import java.util.Scanner;

public class Arena {
    private static long toSolve(long N) {
        long score = 0;
        int i = 1;
        while (N != 0) {
            if (i % 2 == 1) {
                if (N >= 12 && N % 4 == 0) {
                    score = score + 1;
                    N = N - 1;
                }else {
                    if (N % 2 == 0) {
                        score += N / 2;
                        N /= 2; 
                    }else {
                        score += 1;
                        N -= 1;
                    }
                }
            }else {
                if (N >= 12 && N % 4 == 0) {
                    N = N - 1;
                }else {
                    if (N % 2 == 0) {
                        N /= 2; 
                    }else {
                        N -= 1;
                    }
                }
            }
            i = i + 1;
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(toSolve(N));
        }
        sc.close();
    }
}

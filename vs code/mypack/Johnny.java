import java.util.Scanner;

public class Johnny {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                if (a == b) System.out.println(0);
                else {
                    int flag = 0, count = 0;
                    if (a > b && a % 2 == 0) {
                        while (true) {
                            a = a >> 1;
                            count++;
                            if (a == b) {
                                flag = 1;
                                break;
                            }
                            else if (a < b)
                                    break;
                        }
                    }else if (a < b && b % 2 == 0) {
                        while (true) {
                            a = a << 1;
                            count++;
                            if (a == b) {
                                flag = 1;
                                break;
                            }
                            else if (a > b) 
                                    break;
                        }
                    }
                    if (flag == 1) {
                        count = count/3 + (count%3)/2 + (count%3)%2;
                        System.out.println(count);
                    }
                    else 
                        System.out.println(-1);
                }
            }
        }
    }
}
import java.util.Scanner;

public class ChocoPrime {
    
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        boolean ans = true;
        for (int i=2; i*i<=n; i++) {
            if (n%i == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- > 0) {
                String s = sc.nextLine();
                int n = Integer.parseInt(s);
                if (isPrime(n)) {
                    int i=0, j=s.length()-1;
                    int flag = 1;
                    while (i <= j) {
                        if (s.charAt(i) != s.charAt(j)) {
                            flag = 0;
                            break;
                        }
                        i++;
                        j--;
                    }
                    if (flag == 1)  System.out.println("Yes");
                    else    System.out.println("No");
                }else   System.out.println("No");
            }
        }
    }
}

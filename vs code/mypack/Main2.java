import java.util.Scanner;

public class Main2 {
    static int solve(String s, int k) {
        int ans=0;
        int i=0, j=0, c=0;
        while (i < s.length() && j < s.length()) {
            // System.out.println(i + " " + j);
            if (s.charAt(i) == 'M') {
                if (s.charAt(j) == 'I') {
                    int power = k+1 - Math.abs(j-i);
                    if (power > 0) {
                        int flag = 0;
                        if (i > j) {
                            for (int t=j+1; t<i; t++) {
                                if (s.charAt(t) == 'X') {
                                    flag = 1;
                                    j = t+1;
                                    c=0;
                                   break;
                                }else if (s.charAt(t) == ':')
                                    c++;
                            }
                        } 
                        else {
                            for (int t=i+1; t<j; t++) {
                                if (s.charAt(t) == 'X') {
                                    flag = 1;
                                    i = t+1;
                                    c=0;
                                    break;
                                }else if (s.charAt(t) == ':')
                                    c++;
                            }
                        }
                        if (flag == 0) {
                            if (power-c > 0) {
                                ans++;
                                // System.out.println("i: " +i+" j: "+j+ " ans: " + ans);
                                i++;
                                j++;
                                c=0;
                            }else {
                                c=0;
                                if (i > j)
                                    j++;
                                else
                                    i++;
                            }
                        }
                    }else {
                        c=0;
                        if (i > j)
                            j++;
                        else if (i < j)
                            i++;
                    }
                }else if (s.charAt(j) == 'X') {
                    if (i < j)
                        i=j+1;
                    j++;
                }else j++;
            }else {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                // System.out.println(s + " " + n + " " + k);
                System.out.println(solve(s, k));
            }
        }
    }
}

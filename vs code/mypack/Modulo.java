import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char c[] = new char[n];
            c = s.toCharArray();
            int query = sc.nextInt();
            sc.nextLine();
            while(query-- > 0) {
                int type = sc.nextInt();
                if (type == 1) {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    char ch = sc.next().charAt(0);
                    for (int i=l-1; i<r; i++) 
                        c[i] = ch;
                }else {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int p = sc.nextInt();
                    int q = sc.nextInt();
                    int temp = p;
                    for (int i=l-1; i<r; i++) {
                        if (c[i] == 'A') {
                            p = (p-q+1000000007)%1000000007;
                            q = (temp+q)%1000000007;
                        }else if (c[i] == 'B') {
                            p = (p+q)%1000000007;
                            q = (q-temp+1000000007)%1000000007;
                        }
                        temp = p;
                    }
                    System.out.println(p + " " + q);
                }
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class QueueToSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String in = sc.nextLine();
        char s[] = new char[n];
        s = in.toCharArray();
        while(t-- > 0) {
            for (int i=0; i<n-1; i++) {
                if (s[i] == 'B' && s[i+1] == 'G') {
                    char temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                    i++;
                }
            }
        }
        for (int i=0; i<n; i++)
            System.out.print(s[i]);
        
        sc.close();
    }
}

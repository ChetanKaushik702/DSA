import java.util.Scanner;

public class IronMagnetWall {
    static int solve(String s, int k) {
        int ans=0;
        // for (int i=0; i<s.length(); i++) {
        //     int flag = 0;
        //     char c = s.charAt(i);
        //     if (c == 'M') {
        //         int sij=0;
        //         // if (i < s.length()-1) {
        //         //     if (s.charAt(i+1) == 'M')
        //         //         i++;
        //         // }
        //         for (int j=i+1; j<s.length(); j++) {
        //             if (s.charAt(j) == 'X') {
        //                 i = j;
        //                 break;
        //             }else if (s.charAt(j) == ':')   sij++;
        //             else if (s.charAt(j) == 'I') {
        //                 flag = 1;
        //                 if (magneticPower(i, j, sij, k)) {
        //                     ans++;
        //                     i=j;
        //                     break;
        //                 }
        //             }
        //         }
        //     }else if (c == 'I') {
        //         int sij=0;
        //         // if (i < s.length()-1) {
        //         //     if (s.charAt(i+1) == 'I')
        //         //         i++;
        //         // }
        //         for (int j=i+1; j<s.length(); j++) {
        //             if (s.charAt(j) == 'X') {
        //                 i = j;
        //                 break;
        //             }else if (s.charAt(j) == ':')   sij++;
        //             else if (s.charAt(j) == 'M') {
        //                 flag = 1;
        //                 if (magneticPower(i, j, sij, k)) {
        //                     ans++;
        //                     i=j;
        //                     break;
        //                 }
        //             }
        //         }
        //         if (flag == 0)
        //             break;
        //     }
        // }
        int i=0, j=1;
        while (i < s.length() && j < s.length()) {
            if (s.charAt(i) == 'M') {
                if (s.charAt(j) == 'I') {
                    int c=0;
                    for (int k=i+1; k<j; k++) {
                        if ()
                    }
                }
            }
        }
        return ans;
    }

    static boolean magneticPower(int i, int j, int sij, int k) {
        return (k+1 - Math.abs(i-j) -sij) > 0 ? true : false; 
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if (k == 0)
                System.out.println(0);
            else
                System.out.println(solve(s, k));
        }
        sc.close();
    }
}
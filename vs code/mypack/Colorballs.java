import java.util.Scanner;
public class Colorballs {
    
    static int noOfOdds(int[] a) {
        int odds = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 != 0)
                odds++;
        return odds;
    }
    public static void main(String[] args) {
        var sc = new Scanner (System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int[] a = new int[4];
            for (int i=0; i<4; i++) a[i] = sc.nextInt();
            if (noOfOdds(a) > 1) {
                if (a[0] !=0 && a[1] != 0 && a[2] != 0 && a[3] != 0)  {
                    for (int i=0; i<a.length; i++)
                            a[i]--;
                    if (noOfOdds(a) <= 1)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
                else
                    System.out.println("No");
            }
            else 
                System.out.println("Yes");
        }
        sc.close();
    }
}
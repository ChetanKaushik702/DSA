package Codechef;
import java.util.Scanner;
public class PrefixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};
        int pfix[] = new int[a.length];
        pfix[0] = a[0];
        for (int i=1; i<a.length; i++)
            pfix[i] = pfix[i-1] + a[i];
        for (int x:pfix)    System.out.println(x);
        sc.close();
    }
}

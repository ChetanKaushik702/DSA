import java.util.Scanner;
public class Dishes {
    private static void sort(int a[]) {
        for (int i=1; i<a.length; i++) {
            int key = a[i];
            int j = i-1;
            while (j >= 0 && key > a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while(T-- > 0) {
                int n = sc.nextInt();
                if (n == 1) 
                    System.out.println(sc.nextInt());
                else if (n == 2) 
                    System.out.println(Math.max(sc.nextInt(), sc.nextInt()));
                else {
                    int a[] = new int[n];
                    for (int i=0; i<n; i++)
                        a[i] = sc.nextInt();
                    sort(a);
                    if (n == 3) {
                        int time = a[0];
                        if (a[0]-a[1] <= a[2])
                            time = time + a[2];
                        System.out.println(time);
                    }
                    else {
                        int time = a[0];
                        a[2] = a[2] - (a[0]-a[1]);
                        time += Math.max(a[3], a[2]);
                        System.out.println(time);
                    }
                }
            }
        }
    }
}

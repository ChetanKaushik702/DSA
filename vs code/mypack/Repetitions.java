import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = {0, 0, 0, 0};
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    a[0]++;
                    break;
                case 'C':
                    a[1]++;
                    break;
                case 'G':
                    a[2]++;
                    break;
                default:
                    a[3]++;
            }
        }
        int max = 0;
        for (int i:a)  {
            if (max < i)
                max = i;
        }
        System.out.println(max);
        sc.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;

class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1);
        if (sum % 4 != 0) System.out.println("NO");
        else {
            int a[] = new int[n];
            for (int i=0; i<n; i++)
                a[i] = i+1;
            ArrayList<Integer> s1, s2;
            s1 = new ArrayList<>();
            s2 = new ArrayList<>();
            if (n % 4 == 0) {
                int i=0, j=n-1;
                while(i<j) {
                    if (i%2 == 0) {
                        s1.add(a[i]);
                        s1.add(a[j]);
                    }else {
                        s2.add(a[i]);
                        s2.add(a[j]);
                    }
                    i++;
                    j--;
                }
            }else if (n%4 == 3){
                s1.add(1);
                s1.add(2);
                s2.add(3);
                int i=3, j=n-1;
                while(i<j) {
                    if (i%2 == 1) {
                        s1.add(a[i]);
                        s1.add(a[j]);
                    }else {
                        s2.add(a[i]);
                        s2.add(a[j]);
                    }
                    i++;
                    j--;
                }
            }
            System.out.println("YES");
            System.out.println(s1.size());
            StringBuilder s = new StringBuilder();
            for (int i=0; i<s1.size(); i++) s.append(s1.get(i)+" ");
            System.out.println(s);
            s = new StringBuilder();
            System.out.println("\n" + s2.size());
            for (int i=0; i<s2.size(); i++) s.append(s2.get(i)+" ");
            System.out.println(s);
        }
        sc.close();
    }
}
package Codechef.SanketRecursion;

import java.util.ArrayList;

class People {
    static int func(int n) {
        if (n == 1 || n == 2) return n;
        else    return func(n-1) + (n-1)*func(n-2);
    }

    static int power(int a, int b) {
        if (b == 0) return 1;
        else    return a*power(a, b-1);
    }

    static int powerRecur(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;

        int temp = powerRecur(a, b/2);

        if (b%2 == 0)   return temp*temp;
        else    return a*temp*temp;
    }

    static void pattern1(int n, int i) {
        if (n == 0) return;
        if (i < n) {
            System.out.print("* ");
            pattern1(n, i+1);
        }else {
            System.out.println();
            pattern1(n-1, 0);
        }
    }

    static void pattern2(int n, int i, int j) {
        if (n == 0) return;
        if (j <= i) {
            System.out.print("* ");
            pattern2(n, i, j+1);
        }else {
            System.out.println();
            pattern2(n-1, i+1, 0);
        }
    }

    static void printSubsets(int a[], int i, String s) {
        // base case
        if (i == a.length) {
            System.out.println(s);
            return;
        }
        printSubsets(a, i+1, s + Integer.toString(a[i]) + " ");
        printSubsets(a, i+1, s);
    }

    static void printStr(int n, int i, ArrayList<String> sl) {
        if (n == 1) {
            sl.add("0");
            sl.add("1");
        }
    }
    public static void main(String[] args) {
        long beg = System.currentTimeMillis();
        System.out.println(func(3));
        System.out.println(power(11, 3));
        System.out.println(powerRecur(11, 3));
        pattern1(8, 0);
        pattern2(8, 0, 0);
        int a[] = {1, 2, 3};
        printSubsets(a, 0, "");
        ArrayList<String> sl = new ArrayList<>();
        printStr(3, 0, sl);
        long end = System.currentTimeMillis();
        System.out.println("Executed in: " + (end-beg) + "ms");
    }
}
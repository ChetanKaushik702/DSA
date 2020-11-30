import java.math.BigInteger;
import java.util.Scanner;

public class MagicalCandy {
    static int solve(int a[], int r) {
        int n = a.length;
        BigInteger ans = BigInteger.ZERO;
        if (r == 1) {
            return a[0];
        }
        if (r < n) {
            for (int i=0; i<r-1; i++) {
                if ((a[i]&1) == 1)   ans = ans.add(BigInteger.valueOf(a[i]-1));
                else ans = ans.add(BigInteger.valueOf(a[i]));
            }
            ans = ans.add(BigInteger.valueOf(a[r-1]));
        }else if (r == n) {
            for (int i=0; i<n-1; i++) {
                if ((a[i]&1) == 1)   ans = ans.add(BigInteger.valueOf(a[i]-1));
                else ans = ans.add(BigInteger.valueOf(a[i]));
            }
            ans = ans.add(BigInteger.valueOf(a[n-1]));
        }else { // r > n
            // for 1st n rounds
            for (int i=0; i<n-1; i++) {
                if ((a[i]&1) == 1)  ans = ans.add(BigInteger.valueOf(a[i]-1));
                else ans = ans.add(BigInteger.valueOf(a[i]));
            }
            if ((a[n-1]&1) == 0)    ans = ans.add(BigInteger.valueOf(a[n-1]-1));
            else    ans = ans.add(BigInteger.valueOf(a[n-1]));

            BigInteger cnd1 = ans;

            // changing number of candies to even after 1st n rounds
            if ((a[0]&1) == 1)  {cnd1 = ans.subtract(BigInteger.valueOf(a[0]-1)); ans = ans.add(BigInteger.valueOf(a[0]));}
            else {cnd1 = ans.subtract(BigInteger.valueOf(a[0])); ans = ans.add(BigInteger.valueOf(a[0]-1));}

            if (r > n && r < 2*n) {
                for (int i=1; i<r%n-1; i++) {
                    if ((a[i]&1) == 0)  ans = ans.add(BigInteger.valueOf(a[i]));
                    else    ans = ans.add(BigInteger.valueOf(a[i]-1));
                }
            if (r%n == 1 && a[0]%2 == 0) ans = ans.add(BigInteger.ONE);
            if (r%n > 1)
                ans = ans.add(BigInteger.valueOf(a[r%n-1]));
            }else {// r >= 2*n
                BigInteger toAdd = BigInteger.ZERO;
                if (r%n == 0) {
                    if (a[0]%2 == 1) {
                        toAdd = BigInteger.valueOf(r/n-2);
                        toAdd = toAdd.multiply(BigInteger.valueOf(a[0]));
                        ans = ans.add(toAdd);
                    }else {
                        toAdd = BigInteger.valueOf(r/n-2);
                        toAdd = toAdd.multiply(BigInteger.valueOf(a[0]-1));
                        ans = ans.add(toAdd);
                    }
                    toAdd = BigInteger.valueOf(r/n-1);
                    ans = ans.add(toAdd.multiply(cnd1));
                }else {
                    if (a[0]%2 == 1) {
                        toAdd = BigInteger.valueOf(r/n-1);
                        toAdd = toAdd.multiply(BigInteger.valueOf(a[0]));
                        ans = ans.add(toAdd);
                    }else {
                        toAdd = BigInteger.valueOf(r/n-1);
                        ans = ans.add(toAdd.multiply(BigInteger.valueOf(a[0]-1)));
                    }
                    toAdd = BigInteger.valueOf(r/n-1);
                    ans = ans.add(toAdd.multiply(cnd1));

                    for (int i=1; i<r%n-1; i++) {
                        if (a[i]%2 == 1)    ans = ans.add(BigInteger.valueOf(a[i]-1));
                        else    ans = ans.add(BigInteger.valueOf(a[i]));
                    }
                    ans = ans.add(BigInteger.valueOf(a[r%n-1]));
                }
            }
            
        }
        ans = ans.remainder(BigInteger.valueOf(1000000007));
        return ans.intValue();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for (int i=0; i<n; i++)     a[i] = sc.nextInt();
                int q = sc.nextInt();
                while(q-- > 0) {
                    int r = sc.nextInt();
                    System.out.println(solve(a, r));
                }
            }
        }
    }
}

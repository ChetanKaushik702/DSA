package Codechef.SanketRecursion;

public class ClassicalFibandOptimisation {
    
    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    static int fib_dp(int n, int mem[]) {
        if (n == 0) return 0;
        if (mem[n] != 0)    return mem[n];
        int result;
        if (n == 1) result = 1;
        else result = fib_dp(n-1, mem) + fib_dp(n-2, mem);
        mem[n] = result;
        return result;
    }

    public static void main(String[] args) {
        int n = 50;
        long beg = System.currentTimeMillis();
        System.out.println(fib(n));
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-beg) + "ms.");
        beg = System.currentTimeMillis();
        int mem[] = new int[n+1];
        System.out.println(fib_dp(n, mem));
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-beg) + "ms.");
    }
}

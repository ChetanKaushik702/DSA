public class FastExponentiation {

    static int fast_expo(int a, int n) {
        if (n == 0)
            return 1;
        if (n%2 == 0) 
            return fast_expo(a,n/2)*fast_expo(a, n/2);
        else 
            return a*fast_expo(a, n/2)*fast_expo(a, n/2);
        
    }  
    
    static int itr_fast_expo(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if ((n&1) == 1)
                ans = ans*a;
            a = a*a;
            n = n/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fast_expo(5, 10));
        System.out.println(itr_fast_expo(5, 10));
        System.out.println(itr_fast_expo(2,5));
        System.out.println(itr_fast_expo(2,5));
    }
}

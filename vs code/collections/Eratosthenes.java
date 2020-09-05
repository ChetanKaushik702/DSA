import java.util.*;

// A very faster way to generate all the prime numbers upto a given number(O(n*loglogn))
class Eratosthenes {
    static void genPrime(int n) {
        boolean check[] = new boolean[n+1];
        for(int i=0;i<check.length;i++)
            check[i] = true;
        
        for(int p=2; p*p<=n; p++) {
            if(check[p] == true) 
                for(int i=p*p; i<=n; i+=p)
                    check[i] = false;
        }
        for(int i=2;i<check.length;i++)
            if(check[i] == true)
                System.out.print(i + " ");

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            long beg = System.currentTimeMillis();
            genPrime(num);
            long end = System.currentTimeMillis();
            System.out.println("\n" + (end - beg));
            System.out.println(num * Math.log10(Math.log10(num)));
        }
        
    }
}
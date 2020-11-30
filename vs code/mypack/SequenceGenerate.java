import java.util.*;
public class SequenceGenerate {
    static final int MAX_SIZE = 4000000;
	
	static private boolean[] isprime = new boolean[MAX_SIZE+1];
    static private ArrayList<Integer> prime = new ArrayList<>();
    static private int[] SPF = new int[MAX_SIZE+1];
	
	static void manipSieve(int N) {
		// 0 and 1 are not primes 
		isprime[0] = true;
		isprime[1] = true;
		
		for (int i=2; i<=MAX_SIZE && N > 0; i++){
			if (isprime[i] == false) {// false indicates prime
				// put i into the prime array
				prime.add(i);
				N--; // got a prime number
				// A prime number is its own smallest prime factor
				SPF[i] = i;
			}
			
			// Remove all the multiples of i*prime[j]
			for (int j=0; j<prime.size() && i*prime.get(j)<=MAX_SIZE && prime.get(j) <= SPF[i]; j++) {
				isprime[i*prime.get(j)] =  true;
				
				//put smallest prime factor of i*prime[j]
				SPF[i*prime.get(j)] =  prime.get(j);
			}
		}
	}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int b[] = new int[n];
                for (int i=0; i<n; i++)
                    b[i] = sc.nextInt();
                manipSieve(n);
                int a[] = new int[n];
                for (int i=0; i<n; i++)
                    a[i] = prime.get(i);
                for (int j=0; j<n; j++) {
                    if (b[j] != j+1) {
                        a[j] = a[b[j]-1];
                    }
                }
                for (int x:a)   System.out.print(x + " ");
                System.out.println();
            }
        }
    }    
}

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
		    int T = sc.nextInt();
		    while (T-- > 0) {
		        int N = sc.nextInt();
		        int [] s, p, v;
		        s = new int[N];
		        p = new int[N];
		        v = new int[N];
		        for (int i=0; i<N; i++) {
		            s[i] = sc.nextInt();
		            p[i] = sc.nextInt();
		            v[i] = sc.nextInt();
		        }
		        
		        int max_profit = 0;
		        for (int i=0; i<N; i++) {
		            if (p[i] % (s[i]+1) == 0) {
		                if (max_profit < (p[i]/(s[i]+1)*v[i]))
		                    max_profit = p[i]/(s[i]+1)*v[i];
		            }
                }
                System.out.println(max_profit);
	    	}
        }
    }
}
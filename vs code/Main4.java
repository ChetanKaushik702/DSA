import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			int E = sc.nextInt(), F = sc.nextInt(), N = sc.nextInt();
			int [] a = new int[N*2];
			for(int i=0; i<a.length; i++)
				a[i] = sc.nextInt();
			
			int min = Integer.MAX_VALUE;
			for(int i=0; i<a.length; i += 2) {
				if((F - E) % a[i+1] == 0 && min > (F - E) / a[i+1] * a[i]) {
					min = (F - E) / a[i+1] * a[i];
				}
			}
			if(min == Integer.MAX_VALUE)
				System.out.println("This is impossible.");
			else
				System.out.println("The minimum amount of money in the piggy-bank is " + min);
        }
        sc.close();
    }
    
}
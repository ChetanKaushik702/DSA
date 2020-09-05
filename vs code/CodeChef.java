/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
            int sum = 0, i = 1, flag = 0;
		     while(i <= 1000) {
		         sum = x + y + i;
		        for(int j=2; j<=Math.sqrt(sum); j++) 
		            if(sum % j == 0) {
		                flag = 1;
		                break;
		            }
		        if(flag == 0) {
		            System.out.println(i);
		            break;
                }
                flag = 0;
		        i++;
		    }
		}
		System.out.println("\n\n" + Short.MIN_VALUE + "\n" + Integer.MIN_VALUE);
        sc.close();
    }
}

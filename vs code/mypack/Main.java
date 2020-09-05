/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for (int i=0; i<n; i++) a[i] = sc.nextInt();
		    Arrays.sort(a);
		    int fr[] = new int[n];
		    for (int i=0; i<n; i++) fr[i] = 1;
		    int k=0, el = n;
		    for (int i=0; i<n-1; i++) {
		        if (a[i] == a[i+1]) {
		            fr[k]++;
		            el--;
		        }
		        else 
		            k++;
		    }
		  int max = 0, index = 0;
		  for (int i=0; i<el; i++) 
			  if (max < fr[i]) {
				  max = fr[i];
				  index = i;
			  }
		  Map<Integer, Integer> mp = new LinkedHashMap<>();
		  for (int i=0; i<n; i++) {
			  mp.put(a[i], 0);
		  }
		  k = 0;
		  for (Map.Entry<Integer, Integer> x:mp.entrySet()) {
			  if (index == k) {
				  System.out.println(x.getKey());
				  break;
			  }
			  k++;
		  }
		}
		sc.close();
	}
}

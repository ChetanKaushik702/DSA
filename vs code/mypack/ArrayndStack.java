/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayndStack
{
    private static void maxDepth(int[] s) {
        int max = 1, index = 0;
        for (int i=0; i<s.length; i++) {
            int temp = 1;
            int in = i;
            if (s[i] == 1) {
                for (int j=i+1; j<s.length; j++) {
                    if (s[j] == 1) 
                        temp++;
                    else {
                        in = j;
                        break;
                    }
                }
                if (max < temp) {
                    max = temp;
                    index = in;
                    i = i + 2*temp - 1;
                }
            }
        }
        System.out.print(max + " " + index + " ");
        maxSymbol(s);
    }
    
    private static void maxSymbol(int[] s) {
        ArrayDeque<Integer> stck = new ArrayDeque<>();
        int flag = 1;
        int max = 1, index = 0, j = 0, k = 0;;
        for (int i=0; i<s.length; i++) {
            if (flag == 1) {
                k = i;
                flag = 0;
            }
            if (s[i] == 1)
                stck.push(s[i]);
            else {
                stck.pop();
                j = j + 2;
            }
            if (stck.isEmpty()) {
                if (max < j) {
                    max = j;
                    index = k+1;
                }
                flag = 1;
                j = 0;
            }
        }
        System.out.println(max + " " + index);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int seq[] = new int[N];
		for (int i=0; i<N; i++)
		    seq[i] = sc.nextInt();
        maxDepth(seq);
        
        sc.close();
	}
}

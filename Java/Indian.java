import java.util.Scanner;

class Indian{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int f1 = 0, f2 = 0;
		    int n = sc.nextInt();
		    char[] A = new char[n];
		    for(int i=0;i<A.length;i++)
		        A[i] = sc.next().charAt(i);
		    for(int i=0;i<A.length;i++){
		        if(A[i] != 'N'){
		            f1 = 1;
		            if(A[i] != 'Y'){
		                f2 = 1;
		                System.out.println("INDIAN");
		                break;
		            }
		        }
		    }
		    if(f1 == 0) System.out.println("NOT SURE");
		    if(f1 == 1 && f2 == 0) System.out.println("NOT INDIAN");
		}
	}
}
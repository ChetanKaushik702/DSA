import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    while(T-- > 0) {
		    	int m = sc.nextInt();
			    int n = sc.nextInt();
			    for(int i=m; i<=n; i++) {
				    int flag = 0;
				    if(i > 1) 
					    for(int j=2; j<=Math.sqrt(i); j++)
						    if(i % j == 0) {
							    flag = 1;
							    break;
						    }
				    if(flag == 0 && i > 1)	System.out.println(i);
			    }
			    System.out.println();
            }
            sc.close();
    }
}
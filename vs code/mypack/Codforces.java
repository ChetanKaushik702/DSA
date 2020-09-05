import java.util.Scanner;

public class Codforces {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] a = new int[4];
		int flag = n+1, i = n+1;
		while(true) {
		     int t=0, indic=0;
		     flag = i;
		     while(i != 0) {
		         a[t++] = i % 10;
		         i /= 10;
			 }
			 i = flag;
		     for (int p=0; p<3; p++)
		         for (int j=p+1;j<4; j++) 
		            if (a[p] == a[j]) {
		                indic = 1;
		                break;
		            }
		    if(indic == 0) 
				break;
			i++;
		}
		System.out.println(flag);
		sc.close();
	}
} 
import java.util.Scanner;
import java.util.regex.Pattern;

public class Geeks {
	public static void main (String[] args)
	 {
	    try (Scanner sc = new Scanner (System.in)) {
	        int T = sc.nextInt();
	        sc.nextLine();
	        while (T-- > 0) {
				String s = sc.nextLine();
	            String[] str = s.split(Pattern.quote("."));
			   	// for (String x:str) 
				   // 	System.out.println(x);
				for (int i=0; i<str.length; i++) {
	                System.out.print(new StringBuffer(str[i]).reverse() + ".");
	            }
			}
	    }
	 }
}

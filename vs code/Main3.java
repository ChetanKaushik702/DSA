import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0) {
            String mainStr = sc.nextLine();
            char[] ch = mainStr.toCharArray();
            String A = new String(ch,0,10), B = new String(ch,11,5);
            int indic = 0;
            for(int i=0;i<A.length();i++) 
                if(A.regionMatches(i, B, 0, B.length())) {
                    indic = 1;
                    break;
                }
            if(indic == 1)  System.out.println(1);
            else if(indic == 0)     System.out.println(0);
        }
        sc.close();
    }    
}
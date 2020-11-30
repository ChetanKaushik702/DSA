import java.util.Scanner;
public class PlusMultiply {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while(T-- > 0) {
                int n = sc.nextInt();
                int pairs = 0, indic0 = 0, indic2 = 0, found0 = 0, found2 = 0;
                while(n-- > 0) {
                    int v = sc.nextInt();
                    if (v == 0) { 
                        if (indic0 == 0) {
                            found0++;
                            indic0 = 1;
                        }
                        else {
                            found0++;
                        }
                    }
                    else if (v == 2) {
                        if (indic2 == 0) {
                            found2++;
                            indic2 = 1;
                        }
                        else {
                            found2++;
                        }
                    }   
                }
                pairs = found0*(found0 - 1)/2 + found2*(found2 - 1)/2;
                System.out.println(pairs);
            }
        }
    }
}
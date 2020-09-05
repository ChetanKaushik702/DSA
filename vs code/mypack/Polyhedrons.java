import java.util.Scanner;

public class Polyhedrons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            int noOfFaces= 0;
            while (n-- > 0) {
                String s = sc.nextLine();
                if (s.charAt(0) == 'T')
                    noOfFaces += 4;
                else if (s.charAt(0) == 'C')
                        noOfFaces += 6;
                else if (s.charAt(0) == 'D') 
                        noOfFaces += 12;
                else if (s.charAt(0) == 'O')
                        noOfFaces += 8;
                else 
                    noOfFaces += 20;
            }
            System.out.println(noOfFaces);
        }
    }
}
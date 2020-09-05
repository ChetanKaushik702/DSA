/* This program sums a list of numbers entered by the user. It converts the string
   representation of each number into an int using parseInt().
*/
import java.io.*;

public class ParseDemo {
     public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int i;
            int sum = 0;
            System.out.println("Enter numbers, 0 to quit.");
            do {
                try {
                    str = br.readLine();
                    i = Integer.parseInt(str);
                } catch(IOException e) {
                    System.out.println("IOException occurred: " + e);
                    i = 0;
                } catch(NumberFormatException e) {
                    System.out.println("NumberFormatException occurred: " + e);
                    i = 0;
                }
                sum += i;System.out.println("Current sum is: " + sum);
            } while(i != 0);
    }
}
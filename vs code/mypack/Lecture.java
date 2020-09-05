import java.util.Hashtable;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            Hashtable<String, String> hTable = new Hashtable<>(m);
            for (int i=0; i<m; i++) {
                hTable.put(sc.next(), sc.next());
            }
            String[] strIn = new String[n];
            for (int i=0; i<n; i++) 
                strIn[i] = sc.next();
            // System.out.println(hTable);
            // for (String s:strIn)    System.out.print(s+" ");
            for (int i=0; i<n; i++) {
                int key_len = strIn[i].length();
                int value_len = hTable.get(strIn[i]).length();
                if (key_len <= value_len)   System.out.print(strIn[i] + " ");
                else System.out.print(hTable.get(strIn[i]) + " ");
            }
        }
    }
}

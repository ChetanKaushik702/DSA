import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.toLowerCase();
        Hashtable<Character, Integer> key_value = new Hashtable<>(2);
        for (int i=0; i<n; i++)
            key_value.putIfAbsent(s.charAt(i), i);
        if (key_value.size() == 26) 
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
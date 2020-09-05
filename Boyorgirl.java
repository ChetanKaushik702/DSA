import java.io.*;
import java.util.*;
public class Boyorgirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] str = new char[s.length()];
        str = s.toCharArray();
        Arrays.sort(str);
        int count=0;
        for (int i=0; i<str.length-1; i++)
            if (str[i] == str[i+1])
                count++;
        count = str.length-count;
        // System.out.println(count);
        if (count%2 != 0)   System.out.println("IGNORE HIM!");
        else                System.out.println("CHAT WITH HER!");
        br.close();
    }
}
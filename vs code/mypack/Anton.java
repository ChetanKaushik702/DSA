import java.util.*;
public class Anton {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            String s = sc.nextLine();
            StringTokenizer split_s = new StringTokenizer(s, "{, }");
            var ch = new ArrayList<String>();
            while (split_s.hasMoreTokens()) 
                ch.add(split_s.nextToken());
        
            Object[] out = new Object[ch.size()];
            out = ch.toArray();
            Arrays.sort(out);
            int count=1;
            for (int i=0; i<out.length-1; i++) 
                if (!out[i].equals(out[i+1])) 
                    count++;
            
           if (out.length != 0) System.out.println(count);
           else System.out.println(0);
        }
    }
}
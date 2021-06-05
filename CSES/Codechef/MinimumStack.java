package Codechef;
import java.util.*;

class MyPair {
    private final int key;
    private final int value;

    public MyPair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }
}
public class MinimumStack {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int h[] = new int[n];
            for (int i=0; i<n; i++) h[i] = sc.nextInt();

            Stack<MyPair> s = new Stack<>();
            MyPair pair = new MyPair(h[0], h[0]);
            s.push(pair);
            int min=h[0];
            for (int i=1; i<n; i++) {
                min=Math.min(s.peek().getValue(), h[i]);
                MyPair mp = new MyPair(h[i], min);
                s.push(mp);
            }
            // System.out.println(s);
            // int max=1;
            // for (int i=0; i<s.size(); i++) {
            //     MyPair p = s.pop();
            //     System.out.println("At tos: key=" + p.getKey()+ "\tvalue="+p.getValue());
            //     if (max < p.getValue()*(n-i))
            //         max = p.getValue()*(n-i);
            // }
            // System.out.println(max);
            long max = 1;
            // System.out.println(s.size());
            int i=0;
            while(s.size() > 0) {
                MyPair p = s.pop();
                //System.out.println("Key: " + p.getKey() + "\tValue: " + p.getValue());
                if (max < (long)p.getValue()*(n-i))
                    max = (long)p.getValue()*(n-i);
                i++;
            }
            System.out.println(max);
        }
    }
}

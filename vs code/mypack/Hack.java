import java.util.*;

class Solution {
    private ArrayList<Integer> stck;
    private int tos;

    public Solution() {
        stck = new ArrayList<Integer>();
        tos = -1;
    }

    void push(int item) {
        tos++;
        stck.add(tos, item);
    }

    int maxElement() {
        if (tos == -1)
            return Integer.MIN_VALUE;
        int max_value = Integer.MIN_VALUE;
        for (int i=0; i<=tos; i++)
            if (stck.get(i) > max_value)
                max_value = stck.get(i);

        return max_value;
    }

    void pop() {
        if (tos != -1)
            tos--;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- > 0) {
            int v = sc.nextInt();
            Solution ob = new Solution();
            if (v == 1) {
                int data = sc.nextInt();
                ob.push(data);
            }else if (v == 2) {
                ob.pop();
            }else {
                System.out.println(ob.maxElement());
            }
        }
    }
}

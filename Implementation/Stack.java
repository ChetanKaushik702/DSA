public class Stack {
    private int S[];
    private int tos;

    public Stack(int N) {
        S = new int[N];
        tos = -1;
    }

    // push(x) routine
    private void push(int x) {
        // overflow
        if (tos == S.length)
            System.out.println("Stack overflow...");
        else {
            tos = tos + 1;
            S[tos] = x;
        }
    }

    // pop() routine
    private int pop() {
        // underflow
        if (tos == -1) {
            System.out.println("Stack underflow...");
            return Integer.MIN_VALUE;
        }
        int value = S[tos];
        tos = tos - 1;
        return value;
    }

    // driver code
    public static void main(String[] args) {
        Stack stck = new Stack(6);
        for (int i=1; i<=6; i++) {
            stck.push(i);
        }
        for (int i=1; i<=6; i++) {
            System.out.println(stck.pop());
        }
    }
}

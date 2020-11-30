import java.util.*;
public class MyStack {
    private ArrayList<Integer> stck;
    private int tos;

    public MyStack() {
        stck = new ArrayList<Integer>();
        tos = -1;
    }

    // add an element to stack
    void push(int data) {
        tos++;
        stck.add(tos, data);
    }

    // delete an element from top of stack
    int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return stck.get(tos--);
    }

    // find the maximum element in the stack
    int getMax() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        int max = peek();
        for (int i=0; i<=tos; i++)
            if (stck.get(i) > max)
                max = stck.get(i);
        return max;
    }

    // get the element at the top-of-stack
    int peek() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return stck.get(tos);
    }

    // get the size of stack
    int getSize() {
        return tos+1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter 1 to push element");            
            System.out.println("Enter 2 to pop element");            
            System.out.println("Enter 3 to peek element");            
            System.out.println("Enter 4 to get size of stack");            
            System.out.println("Enter 5 to get max element of stack");            
            System.out.println("Enter 0 to exit");            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    int pop = stack.pop();
                    if (pop != Integer.MIN_VALUE)
                        System.out.println(pop);
                    break;
                case 3:
                    int peek = stack.peek();
                    if (peek != Integer.MIN_VALUE)
                        System.out.println(peek);
                    break;
                case 4:
                    System.out.println(stack.getSize());
                    break;
                case 5:
                    int max = stack.getMax();
                    if (max != Integer.MIN_VALUE)
                        System.out.println(max);
                    break;
            }
            System.out.println();
        }while(choice != 0);

        sc.close();
    }
}

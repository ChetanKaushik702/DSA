public class Queue {
    private int Q[];
    private int head, tail;

    public Queue(int N) {
        Q = new int[N];
        head = -1;
        tail = -1;
    }

    // enQueue(x) routine
    private void enQueue(int x) {
        // overflow detection
        if ((tail + 1) % Q.length == head)
            System.out.println("Queue overflow...");
        else {
            // for first element
            if (head == -1)
                head = tail = 0;
            else
                tail = (tail + 1) % Q.length;
            Q[tail] = x;
        }
    }

    // deQueue() routine
    private int deQueue() {
        // underflow detection
        if (head == -1) {
            System.out.println("Queue underflow...");
            return Integer.MIN_VALUE;
        }
        int value;
        if (head == tail) {
            value = Q[head];
            head = tail = -1;
        }else {
            value = Q[head];
            head = head + 1;
        }
        return value;
    }

    // printing method
    void printContents() {
        if (head != -1)
            for (int i=head; i<=tail; i=(i+1)%Q.length)
                System.out.println("i: " + i + "\tvalue: " + Q[i]);
    }

    // driver method
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        // for (int i=1; i<=6; i++)
        //     queue.enQueue(i);
        
        // for (int i=1; i<=6; i++)
        //     System.out.println(queue.deQueue());
        queue.enQueue(4);
        queue.printContents();
        System.out.println();
        queue.enQueue(1);
        queue.printContents();
        System.out.println();
        queue.enQueue(3);
        queue.printContents();
        System.out.println();
        queue.deQueue();
        queue.printContents();
        System.out.println();
        queue.enQueue(8);
        queue.printContents();
        System.out.println();
        queue.deQueue();
        queue.printContents();
    }
}

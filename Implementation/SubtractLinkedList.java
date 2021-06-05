public class SubtractLinkedList {

    // driver-subtract rountine
    static Node driverSubtract(Node l1, Node l2) {
        if (l1 == null && l2 == null)
            return null;
        
        l1 = removeLeadingZeros(l1);
        l2 = removeLeadingZeros(l2);

        if (l1 == null && l2 == null)
            return new Node(0);
        else if (l1 == null)
            return l2;
        else {
            int n1 = sizeOfLinkedList(l1);
            int n2 = sizeOfLinkedList(l2);
            if (n1 == n2) {
                Node greater = compare(l1, l2);
                if (greater == null)
                    return new Node(0);
                else if (greater == l1) {
                    Node l = reverse(l1);
                    Node s = reverse(l2);
                    return mainSubtract(l, s);
                }else {
                    Node l = reverse(l2);
                    Node s = reverse(l1);
                    return mainSubtract(l, s);
                }
            }

            Node r1 = reverse(l1);
            Node r2 = reverse(l2);

            if (n1 < n2)
                return mainSubtract(r2, r1);
            else
                return mainSubtract(r1, r2);
        } 
        
    }

    static Node mainSubtract(Node l, Node s) {
        Node head = null, temp = null;
        int b = 0;
        while (s != null) {
            if (l.data + b < s.data) {
                Node node = new Node(10 + l.data + b - s.data);
                b = -1;
                if (head == null) {
                    head = node;
                    temp = head;
                }else {
                    temp.next = node;
                    temp = node;
                }
            }else {
                Node node = new Node(l.data + b - s.data);
                b = 0;
                if (head == null) {
                    head = node;
                    temp = head;
                }else {
                    temp.next = node;
                    temp = node;
                }
            }

            l = l.next;
            s = s.next;
        }

        while (l != null) {
            if (l.data + b < 0) {
                Node node = new Node(l.data + b + 10);
                b = -1;
                temp.next = node;
                temp = node;
            }else {
                Node node = new Node(l.data + b);
                b = 0;
                temp.next = node;
                temp = node; 
            }

            l = l.next;
        }

        head = reverse(head);
        head = removeLeadingZeros(head);

        return head;
    }

    static int sizeOfLinkedList(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        return size;
    }

    static Node compare(Node h1, Node h2) {
        Node t1 = h1, t2 = h2;
        while (t1 != null && t2 != null) {
            if (t1.data != t2.data) {
                if (t1.data > t2.data)
                    return h1;
                else
                    return h2;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        if (t1 != null) 
            return h1;
        else if (t2 != null)
            return h2;
        else
            return null;
    }
    static Node reverse(Node head) {
        Node currNode = null, nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = currNode;
            currNode = head;
            head = nextNode;
        }
        return currNode;
    }

    static Node removeLeadingZeros(Node head) {
        while(head != null && head.data == 0)
            head = head.next;
        return head;
    }
    
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // driver code 
    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node h12 = new Node(3);
        Node h13 = new Node(5);
        Node h14 = new Node(7);

        h1.next = h12;
        h12.next = h13;
        h13.next = h14;

        Node h2 = new Node(1);
        Node h22 = new Node(4);
        Node h23 = new Node(6);
        Node h24 = new Node(8);
        Node h25 = new Node(10);
        Node h26 = new Node(12);
        Node h27 = new Node(19);
        Node h28 = new Node(99);
        Node h29 = new Node(700);
        
        h2.next = h22;
        h22.next = h23;
        h23.next = h24;
        h24.next = h25;
        h25.next = h26;
        h26.next = h27;
        h27.next = h28;
        h28.next = h29;

        // Node sub = driverSubtract(h1, h2);
        // System.out.print("Final list: ");
        // printList(sub);
        printList(merge(h1, h2));
    
    }

    // merge two sorted linked-lists
    static Node merge(Node head1, Node head2) {
        Node head = null, temp = null;
        if (head1.data < head2.data) {
            head = head1;
            temp = head;
            head1 = head1.next;
        }else if (head1.data > head2.data) {
            head = head2;
            temp = head;
            head2 = head2.next;
        }else {
            head = head1;
            temp = head;
            head1 = head1.next;
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else if (head2.data < head1.data) {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }else {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        temp.next = null;
        if (head1 != null)
            temp.next = head1;
        else if (head2 != null)
            temp.next = head2;
        
        return head;
    }

    
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

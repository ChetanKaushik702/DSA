import java.util.ArrayList;

/*
    This is an implementation of BST which supports
    all the dynamic set operation in O(h) time,
    where h is the height of the BST
*/

class BST {

    // Lowest Common Ancestor of two internal nodes
    Node lca(Node n1, Node n2) {
        if (n1 == null || n2 == null)
            return null;
        ArrayList<Node> ances1, ances2;
        ances1 = new ArrayList<>();
        ances2 = new ArrayList<>();

        n1 = n1.p;
        while (n1 != null) {
            ances1.add(n1);
            n1 = n1.p;
        }
        n2 = n2.p;
        while (n2 != null) {
            ances2.add(n2);
            n2 = n2.p;
        }

        Node ancestor = null;
        for (int i=0; i<ances1.size(); i++) {
            for (int j=0; j<ances2.size(); j++) 
                if (ances1.get(i) == ances2.get(j)) {
                    ancestor = ances1.get(i);
                    break;
                }
            if (ancestor != null)
                break;
        }
        return ancestor;
    }

    // lca without using the parent pointer
    Node lca_without_p(Node root, Node l1, Node l2) {
        if (l1 == null || l2 == null)   return null;
        Node ancestor = null;
        Node itr = root;
        ArrayList<Node> ances1 = new ArrayList<>();
        while (itr != null && itr.key != l1.key) {
            ances1.add(itr);
            if (itr.key < l1.key)  itr = itr.right;
            else    itr = itr.left;
        }

        itr = root;
        ArrayList<Node> ances2 = new ArrayList<>();
        while (itr != null && itr.key != l2.key) {
            ances2.add(itr);
            if (itr.key > l2.key)   itr = itr.left;
            else    itr = itr.right;
        }

        for (int i=ances1.size()-1; i>=0; i--) {
            for (int j=ances2.size()-1; j>=0; j--) {
                if (ances1.get(i) == ances2.get(j)) {
                    ancestor = ances1.get(i);
                    break;
                }
            }
            if (ancestor != null)   break;
        }
        return ancestor;
    }
    // size of tree routine
    int size(Node x) {
        if (x == null)
            return 0;
        else 
            return Math.max(1 + size(x.left), 1 + size(x.right));
    }
    
    // maximum value routine
    Node maximum(Node x) {
        while (x.right != null)
            x = x.right;
        return x;
    }

    // minimum value routine
    Node minimum(Node x) {
        while (x.left != null)
            x = x.left;
        return x;
    }

    // successor routine
    Node successor(Node x) {
        if (x.right != null)
            return minimum(x.right);
        Node y = x.p;
        while (y != null && x == y.right) {
            x = y;
            y = y.p;
        }
        return y;
    }

    // predecessor routine
    Node predecessor(Node x) {
        if (x.left != null)
            return maximum(x.left);
        Node y = x.p;
        while (y != null && x == y.left) {
            x = y;
            y = y.p;
        }
        return y;
    }

    // search routine
    Node search(Node x, int key) {
        if (x == null)
            return x;
        else if (x.key == key)
            return x;
        else if (x.key > key)
            return search(x.left, key);
        else
            return search(x.right, key);
    }
    // inorder-tree walk
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // insert-routine
    void insert(Sentinel T, Node z) {
        Node y = null;
        Node x = T.root;

        while (x != null) {
            y = x;
            if (z.key < x.key)
                x = x.left;
            else
                x = x.right;
        }

        z.p = y;
        if (y == null)
            T.root = z;
        else if (z.key < y.key)
            y.left = z;
        else
            y.right = z;
    }

    // delete sub-routine -> transplant
    void tree_transplant(Sentinel T, Node u, Node v) {
        if (u.p == null)
            T.root = v;
        else if (u.p.left == u)
            u.p.left = v;
        else
            u.p.right = v;
        if (v != null)
            v.p = u.p;
    }

    // delete main-routine (successor)
    void tree_delete_suc(Sentinel T, Node z) {
        if (z != null) {
            if (z.left == null)
                tree_transplant(T, z, z.right);
            else if (z.right == null)
                tree_transplant(T, z, z.left);
            else {
                Node y = successor(z);
                if (y.p != z) {
                    tree_transplant(T, y, y.right);
                    y.right = z.right;
                    z.right.p = y;
                }
                tree_transplant(T, z, y);
                y.left = z.left;
                y.left.p = y;
            }
        }
    }

    // delete main-routine (predecessor)
    void tree_delete_pre(Sentinel T, Node z) {
        if (z != null) {
            if (z.left == null)
                tree_transplant(T, z, z.right);
            else if (z.right == null)
                tree_transplant(T, z, z.left);
            else {
                Node y = predecessor(z);
                if (y.p != z) {
                    tree_transplant(T, y, y.left);
                    y.left = z.left;
                    y.left.p = z;
                }
                tree_transplant(T, z, y);
                y.right = z.right;
                y.right.p = y;
            }
        }
    }
    // driver method
    public static void main(String[] args) {
        BST bst = new BST();
        Sentinel T = bst.new Sentinel();
        bst.insert(T, bst.new Node(4));
        bst.insert(T, bst.new Node(2));
        bst.insert(T, bst.new Node(6));
        bst.insert(T, bst.new Node(1));
        bst.insert(T, bst.new Node(5));
        bst.insert(T, bst.new Node(3));
        bst.insert(T, bst.new Node(10));
        bst.insert(T, bst.new Node(9));
        bst.insert(T, bst.new Node(7));
        bst.insert(T, bst.new Node(8));
        bst.insert(T, bst.new Node(12));
        bst.insert(T, bst.new Node(13));
        bst.insert(T, bst.new Node(11));

        bst.inorder(T.root);
        // System.out.println();
        // System.out.println(bst.lca(bst.search(T.root, 7), bst.search(T.root, 1)).key);
        // System.out.println(bst.lca_without_p(T.root, bst.search(T.root, 7), bst.search(T.root, 1)).key);
        // System.out.println("size:" + bst.size(T.root));
        bst.tree_delete_pre(T, bst.search(T.root, 10));
        System.out.println();
        bst.inorder(T.root);
        // System.out.println("size:" + bst.size(T.root));
        // System.out.println();
        // bst.tree_delete(T, bst.search(T.root, 4));
        // bst.inorder(T.root);
        // System.out.println("size:" + bst.size(T.root));
        // System.out.println("T.root: " + T.root.key);
        // System.out.println(bst.maximum(T.root).key);
        // System.out.println(bst.minimum(T.root).key);
        // System.out.println(bst.successor(T.root.left.right).key);
        // System.out.println(bst.predecessor(T.root.right.left).key);
        // System.out.println(bst.search(T.root, -1));
    }

    // Structure of a Node in BST
    class Node {
        private int key;
        private Node p;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            this.p = null;
            this.left = null;
            this.right = null;
        }
    }

    // sentinel node
    class Sentinel {
        private Node root;

        public Sentinel() {
            this.root = null;
        }
    }
}
/*  Red-Black tree properties:
** (i)   Every node is either red or black.
** (ii)  Root node is always black.
** (iii) Every leaf(NIL) is black.
** (iv) If a node is red, then its children are black.
** (v) For each node, all simple paths from the node to the descendant leaves
**   contain the same number of black nodes.
*/

class RBT {
    private static final int RED = 1;
    private static final int BLACK = 0;
    
    // inorder-traversal routine
    void inorder(Sentinel T, Node root) {
        if (root != T.nil) {
            inorder(T, root.left);
            System.out.println("key: " + root.key + "\tcolor: " + root.color);
            inorder(T, root.right);
        }
    }

    // preorder-traversal routine
    void preorder(Sentinel T, Node root) {
        if (root != T.nil) {
            System.out.println("key: " + root.key + "\tcolor: " + root.color);
            preorder(T, root.left);
            preorder(T, root.right);
        } 
    }

    // tree-minimum routine
    Node treeMinimum(Sentinel T, Node root) {
        while (root != T.nil && root.left != T.nil)
            root = root.left;
        return root;
    }

    // search routine
    Node search(Sentinel T, int key) {
        Node root = T.root;
        while (root != T.nil) {
            if (root.key == key)
                return root;
            else if (root.key > key)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }

    // right-Rotate routine
    void rightRotate(Sentinel T, Node x) {
        // System.out.println("Inside rightRotate: " + x.key);
        /* Assumption: x.left != T.nil and root's parent is T.nil*/
        Node y = x.left;  // set y
        x.left = y.right; // turn y's right subtree into x's left subtree
        if (y.right != T.nil)
            y.right.p = x;
        y.p = x.p;          // link x's parent to y's parent
        if (x.p == T.nil)
            T.root = y;
        else if (x == x.p.left)
            x.p.left = y;
        else
            x.p.right = y;
        y.right = x;        // put x on y's right
        x.p = y;
    }

    // left-Rotate routine
    void leftRotate(Sentinel T, Node x) {
        // System.out.println("Inside leftRotate: " + x.key);
        /* Assumption: x.right != T.nil and root's parent is T.nil*/
        Node y = x.right; // set y
        x.right = y.left; // turn y's left subtree into x's right subtree
        if (y.left != T.nil)
            y.left.p = x;
        y.p = x.p;          // link x's parent to y
        if (x.p == T.nil)
            T.root = y;
        else if (x == x.p.left)
            x.p.left = y;
        else
            x.p.right = y;
        y.left = x;         // put x on y's left
        x.p = y; 
    } 
    
    // insert node-routine
    void rbInsert(Sentinel T, Node z) {
        // System.out.println("Inside rbInsert: " + z.key);
        /* Properties that can be violated: 
        ** Root node is always black.
        ** If a node is red, then its children are black.
        */
        Node y = T.nil;
        Node x = T.root;

        while (x != T.nil) {
            y = x;
            if (z.key < x.key)
                x = x.left;
            else
                x = x.right;
        }

        z.p = y;
        // System.out.println("z's parent data: " + z.p.key);
        if (y == T.nil)
            T.root = z;
        else if (z.key < y.key)
            y.left = z;
        else
            y.right = z;
        
        z.left = T.nil;
        z.right = T.nil;
        z.color = RED; // 1 indicates RED

        rbInsertFixup(T, z);
    }

    void rbInsertFixup(Sentinel T, RBT.Node z) {
        // System.out.println("Inside rbInsertFixup " + z.key);
        while (z.p.color == RED) { // z's parent is RED
        // System.out.println("Inside rbInsertFixup while loop " + z.key);
            if (z.p == z.p.p.left) {
                Node y = z.p.p.right;
                if (y.color == RED) {
                    z.p.color = BLACK;
                    y.color = BLACK;
                    z.p.p.color = RED;
                    z = z.p.p;
                }
                else if (z == z.p.right) {
                    z = z.p;
                    leftRotate(T, z);
                }
                else {
                    z.p.color = BLACK;
                    z.p.p.color = RED;
                    rightRotate(T, z.p.p);
                }
            }else {
                Node y = z.p.p.left;
                if (y.color == RED) {
                    z.p.color = BLACK;
                    y.color = BLACK;
                    z.p.p.color = RED;
                    z = z.p.p;
                }
                else if (z == z.p.left) {
                    z = z.p;
                    rightRotate(T, z);
                }
                else {
                    z.p.color = BLACK;
                    z.p.p.color = RED;
                    leftRotate(T, z.p.p);
                }
            }
        }
        T.root.color = BLACK;
    }

    // delete node routine
    void rbDelete(Sentinel T, Node z) {
        /* Properties that can be violated when y.color = BLACK:
        ** Root node is always black.
        ** If a node is red, then its children are black.
        ** For each node, all simple paths from the node to the descendant leaves
        contain the same number of black nodes.*/
        Node y = z;
        Node x = null;
        byte y_original_color = y.color;
        if (z.left == T.nil) {
            x = z.right;
            rbTransplant(T, z, z.right);
        }
        else if (z.right == T.nil) {
            x = z.left;
            rbTransplant(T, z, z.left);
        }
        else {
            y = treeMinimum(T, z.right);
            y_original_color = y.color;
            x = y.right;
            if (y.p == z)
                x.p = y;
            else {
                rbTransplant(T, y, y.right);
                y.right = z.right;
                y.right.p = y;
            }
            rbTransplant(T, z, y);
            y.left = z.left;
            y.left.p = y;
            y.color = z.color;
        }

        if (y_original_color == BLACK) 
            treeDeleteFixup(T, x);
    }

    // delete node fixup routine
    void treeDeleteFixup(Sentinel T, Node x) {
        while (x != T.root && x.color == BLACK) {
            if (x == x.p.left) {
                Node w = x.p.right;
                if (w.color == RED) {
                    w.color = BLACK;
                    x.p.color = RED;
                    leftRotate(T, x.p);
                    w = x.p.right;
                }
                if (w.left.color == BLACK && w.right.color == BLACK) {
                    w.color = RED;
                    x = x.p;
                }
                else if (w.right.color == BLACK) {
                    w.left.color = BLACK;
                    w.color = RED;
                    rightRotate(T, w);
                    w = x.p.right;
                }else {
                    w.color = x.p.color;
                    x.p.color = BLACK;
                    w.right.color = BLACK;
                    leftRotate(T, x.p);
                    x = T.root;
                }
            }else {
                Node w = x.p.left;
                if (w.color == RED) {
                    w.color = BLACK;
                    x.p.color = RED;
                    rightRotate(T, x.p);
                    w = x.p.left;
                }
                if (w.left.color == BLACK && w.right.color == BLACK) {
                    w.color = RED;
                    x = x.p;
                }
                else if (w.left.color == BLACK) {
                    w.right.color = BLACK;
                    w.color = RED;
                    leftRotate(T, w);
                    w = x.p.left;
                }else {
                    w.color = x.p.color;
                    x.p.color = BLACK;
                    w.left.color = BLACK;
                    rightRotate(T, x.p);
                    x = T.root;
                }
            }  
        }
        x.color = BLACK;
    }

    // transplant routine
    void rbTransplant(Sentinel T, Node u, Node v) {
        if (u.p == T.nil)
            T.root = v;
        else if (u == u.p.left)
            u.p.left = v;
        else
            u.p.right = v;
        v.p = u.p;
    }

    public static void main(String[] args) {
        RBT rbt = new RBT();
        Sentinel T = rbt.new Sentinel();
        
        rbt.rbInsert(T, rbt.new Node(41));
        rbt.rbInsert(T, rbt.new Node(38));
        rbt.rbInsert(T, rbt.new Node(31));
        rbt.rbInsert(T, rbt.new Node(12));
        rbt.rbInsert(T, rbt.new Node(19));
        rbt.rbInsert(T, rbt.new Node(8));

        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 8));
        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 12));
        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 19));
        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 31));
        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 38));
        rbt.inorder(T, T.root);
        System.out.println();

        rbt.rbDelete(T, rbt.search(T, 41));
        rbt.inorder(T, T.root);
        System.out.println();
        // rbt.preorder(T, T.root);
    }

    // sentinel node
    class Sentinel {
        private Node nil;
        private Node root;

        public Sentinel() {
            this.nil = new Node(-1);
            this.nil.color = BLACK; // black color
            this.root = this.nil;
        }
    }

    // structure of a node in Red-black tree
    class Node {
        private int key;
        private byte color;
        private Node left;
        private Node right;
        private Node p;

        public Node(int data) {
            this.key = data;
        }
    }
}
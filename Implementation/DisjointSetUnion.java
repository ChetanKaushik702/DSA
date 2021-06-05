import java.util.*;

public class DisjointSetUnion {

    private Map<Integer, Node> map = new HashMap<>();
    
    // make-set
    void makeSet(int data) {
        Node node = new Node(data);
        node.parent = node;
        map.put(data, node);
    }

    // find
    Node find(Node node) {
        if (node.parent != node)
            node.parent = find(node.parent);
        return node.parent;
    }

    // union
    void union(int d1, int d2) {
        Node set1 = map.get(d1);
        Node set2 = map.get(d2);
        if (find(set1) == find(set2))
            return;
        if (set1.parent.rank > set2.parent.rank) {
            set2.parent = set1.parent;
        } else {
            set2.parent = set1.parent;
            if (set1.parent.rank == set2.parent.rank)
                set1.parent.rank++;
        }
    }

    class Node {
        Node parent;
        int data;
        int rank;
    
        public Node(int data) {
            this.data = data;
            this.rank = 0;
        }
    }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion();
        for (int i = 1; i <= 5; i++)
            dsu.makeSet(i);
        
        // System.out.println(dsu.map);
        for (int i = 1; i <= 5; i++)
            System.out.println("parent(" + i + "): " + dsu.map.get(i).parent.data);
        dsu.union(1, 2);
        dsu.union(3, 4);
        dsu.union(4, 5);
        dsu.union(1, 3);

        // System.out.println(dsu.map);
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print("parent(" + i + "): " + dsu.map.get(i).parent.data);
            System.out.println("\trank(" + i + "): " + dsu.map.get(i).rank);
        }
        
    }
}
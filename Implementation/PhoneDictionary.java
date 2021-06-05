import java.util.ArrayList;
import java.util.Scanner;

class TrieNode {

    TrieNode[] children;
    boolean isEnd;
    ArrayList<String> list;

    public TrieNode() {
        this.children = new TrieNode[26];
        this.isEnd = false;
        this.list = new ArrayList<String>();
    }

}

class Driver {

    static void insert(TrieNode root, String s) {
        TrieNode itr = root;

        for (int i = 0 ; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';

            if (itr.children[index] == null)
                itr.children[index] = new TrieNode();
            
            itr = itr.children[index];
        }

        itr.isEnd = true;
        itr.list.add(s);
    }

    static TrieNode searchPrefix(TrieNode root, String s) {
        TrieNode itr = root;

        for (int i = 0 ; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';

            if (itr.children[index] == null)    return null;
            itr = itr.children[index];
        }

        return itr;
    }

    static void printWord(TrieNode root, String s) {
        for (int i = 0 ; i < s.length() ; i++) {
            String prefix = s.substring(0, i+1);
            TrieNode result = searchPrefix(root, prefix);
            if (result != null) {
                printHelper(result);
                System.out.println();
            }
            else {
                System.out.println(0);
            }
        }
    }

    static void printHelper(TrieNode root) {
        if (root.isEnd) {
            for (int i = 0 ; i < root.list.size() ; i++)
                System.out.print(root.list.get(i) + " ");
        }
            for (int i = 0 ; i < 26 ; i++) {
                if (root.children[i] != null)   printHelper(root.children[i]);
            }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String sArr[] = new String[n];
                for (int i = 0 ; i < n ; i++)   sArr[i] = sc.next();
                sc.nextLine();
                String s = sc.nextLine();

                TrieNode root = new TrieNode();
                for (int i = 0 ; i < n ; i++)   insert(root, sArr[i]);
                printWord(root, s);
            }
        }
    }
}
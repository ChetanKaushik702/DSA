
class Trie {

    private final static int ALPHABET_SIZE = 26;
    private TrieNode node;

    public Trie() {
        this.node = new TrieNode(false); 
    }

    // insert method
    void insert(Trie root, String s) {

        TrieNode itrRoot = root.node;

        for (int i = 0 ; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';
            if (itrRoot.children[index] == null)
                itrRoot.children[index] = new TrieNode(false);
            itrRoot = itrRoot.children[index];
        }

        itrRoot.isEndOfWord = true;

    }

    // search method
    boolean search(Trie root, String s) {
        TrieNode itrNode = root.node;

        for (int i = 0 ; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';
            if (itrNode.children[index] == null)
                return false;
            itrNode = itrNode.children[index];
        }

        if (itrNode.isEndOfWord)
            return true;

        return false;
    }

    // delete a key in tries
    TrieNode delete(TrieNode root, String key) {
        
        return deleteHelper(root, key, 0);
    }

    // delete trie helper
    TrieNode deleteHelper(TrieNode root, String s, int depth) {

        if (root == null) return null;

        if (s.length() == depth) {
            if (root.isEndOfWord)
                root.isEndOfWord = false;

            if (isTrieNodeEmpty(root))
                root = null;
            
            return root;
        }
        int index = s.charAt(depth) - 'a';

        root.children[index] = deleteHelper(root.children[index], s, depth+1);

        if (isTrieNodeEmpty(root) && root.isEndOfWord == false)
            root = null;
        
        return root;
    }
    // checks whether a trie node is empty or not
    boolean isTrieNodeEmpty(TrieNode node) {

        for (int i = 0 ; i < ALPHABET_SIZE ; i++)
            if (node.children[i] != null)
                return false;

        return true;
    }

    // print words in lexicographic order
    void print(TrieNode root, String s) {
        if (root.isEndOfWord == true)   System.out.println(s);

        for (int i = 0 ; i < ALPHABET_SIZE ; i++) {
            if (root.children[i] != null) {
                print(root.children[i], s + "" + (char)('a' + i));
            }
        }
    }

    // driver method
    public static void main(String[] args) {
        
        Trie root = new Trie();

        String [] words = {"bat", "apple", "fish", "pomegranate", "kuhu", "lalita", "chetan", "tara"
                            , "purshottam", "triveni", "fatehji", "abhishekji", "kartik", "kirti", 
                           "praveen", "satyawati", "niranjanji" , "kanhaiyatauji"};

        String [] w = {"ab", "df", "ac", "sa", "sm", "geeks", "geek"};

        for (int i = 0 ; i < w.length ; i++) {
            root.insert(root, w[i]);
            // System.out.println("Found: " + words[i] + "\tresult: " 
            //                   + root.search(root, words[i]));
        }
        System.out.println("Before deletion:");
        root.print(root.node, "");
        TrieNode node = root.delete(root.node, "ab");
        System.out.println("After deletion:");
        root.print(node, "");
        
    }

    class TrieNode {

        private TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode(boolean isEndOfWord) {
            this.children = new TrieNode[ALPHABET_SIZE];
            this.isEndOfWord = isEndOfWord;
        }

    }

    
}

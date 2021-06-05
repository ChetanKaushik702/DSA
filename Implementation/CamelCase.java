import java.util.*;
import java.io.*;
class GFG
 {
    private TrieNode node;
    
    public GFG()
    {
        this.node = new TrieNode();
    }
    
    void insert(TrieNode root, String str)
    {
        TrieNode itr = root;
        for (int i = 0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                int index = str.charAt(i) - 'A';
                if (itr.children[index] == null)
                    itr.children[index] = new TrieNode();
                itr = itr.children[index];
            }
        }
        
        itr.isEnd = true;
        itr.vector.add(str);
    }
    
    void getAnswer(TrieNode root, String str) {
        TrieNode itr = search(root, str);
        if (itr == null)
            System.out.println("No match found");
        else {
            printWords(itr);
        }
    }
    
    void printWords(TrieNode root) {
        if (root.isEnd) {
            for (int i = 0 ; i < root.vector.size() ; i++)
                System.out.print(root.vector.get(i) + " ");
        }
        
        for (int i = 0 ; i < 26 ; i++) {
            if (root.children[i] != null)
                printWords(root.children[i]);
        }
    }
    
    TrieNode search(TrieNode root, String str) {
        TrieNode itr = root;
        
        for (int i = 0 ; i < str.length() ; i++) {
            int index = str.charAt(i) - 'A';
            if (itr.children[index] == null)
                return null;
            itr = itr.children[index];
        }
        
        return itr;
    }
    
	public static void main (String[] args) throws IOException
	 {
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	    {
	        int t = Integer.parseInt(br.readLine());
	        
	        while (t-- > 0)
	        {
	            int n = Integer.parseInt(br.readLine());
	            String s[] = br.readLine().split(" ");
	            String str = br.readLine();
	            
	            GFG obj = new GFG();
	            for (int i = 0 ; i < s.length ; i++)
	                obj.insert(obj.node, s[i]);
	           
	            obj.getAnswer(obj.node, str);
	        }
	    }
	 }
	 
	 class TrieNode
	 {
	     private TrieNode[] children;
	     private boolean isEnd;
	     private ArrayList<String> vector;
	     
	     public TrieNode()
	     {
	         this.children = new TrieNode[26];
	         this.isEnd = false;
	         this.vector = new ArrayList<String>();
	     }
	 }
}
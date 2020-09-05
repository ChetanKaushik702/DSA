import java.util.StringTokenizer;

class StringTokenDemo {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        StringTokenizer str = new StringTokenizer(s, " ,?'");
        int count = 0;
        while (str.hasMoreTokens()) {
            count++;
            String next = str.nextToken();
            System.out.println(next);
        }
        System.out.println(count);

        
    }
}
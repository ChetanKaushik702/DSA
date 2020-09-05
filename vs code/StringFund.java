
public class StringFund {
    public StringFund(byte[] chrs, int i, int j) {
    }

    public static void main(String[] args) {

        int chrs[] = { 65, 66, 67, 68, 69, 70 };
        String s1 = new String(chrs, 0, chrs.length);
        char chars[] = {'A', 'B', 'C', 'D', 'E','F'};
        String s2 = new String(chars);
        System.out.println(s1 + "Hello Everyone!\r Welcome you all!" + s2);
    }     
}
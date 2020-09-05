import java.util.*;
class StringPrac {
    static String getSmallestAndLargest(String s, int k) {
        
        String[] str = new String[s.length()-k+1];
        for(int i=0;i<=s.length()-k;i++)
            str[i] = s.substring(i, 3 + i);
        Arrays.sort(str);
        for (String string : str) {
            System.out.print(string + " ");
        }
        return "\n" + str[0] + "\n" + str[str.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int k = sc.nextInt();
        sc.close();
        System.out.println(getSmallestAndLargest(input, k));
    }
}
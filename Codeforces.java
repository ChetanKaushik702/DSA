import java.util.*;
public class Codeforces {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        String s = sc.nextLine();
        StringTokenizer str = new StringTokenizer(s, "+");
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (str.hasMoreTokens()) {
            String in = str.nextToken();
            list.add(Integer.parseInt(in));
        }
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        Arrays.sort(arr);
        System.out.print(arr[0]);
        for (int k=1; k < arr.length; k++) System.out.print("+" + arr[k]);
        }
    }
}
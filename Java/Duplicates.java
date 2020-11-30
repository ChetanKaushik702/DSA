import java.util.ArrayList;
import java.util.Scanner;
public class Duplicates {
    private static int delDuplicates(ArrayList<Integer> a) {
        int size = a.size();
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                if (a.get(i) == a.get(j)) {
                    for (int k=j; k<size-1; k++) 
                        a.set(k, a.get(k+1));
                    size--;
                    j--;
                }
            }
        }
        return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String s[] = sc.nextLine().split(" ");
        for (int i=0; i<s.length; i++)
            list.add(Integer.parseInt(s[i]));
        // System.out.println(list);
        int size = delDuplicates(list);
        for (int i=0; i<size; i++)
            System.out.print(list.get(i) + " ");
    }
}
//package collections;
import java.util.*;
class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<Integer>());
        a.get(0).add(0);
        a.add(new ArrayList<Integer>());
        a.get(1).add(1);
        a.get(1).add(2);
        a.add(new ArrayList<Integer>());
        a.get(2).add(3);
        a.get(2).add(4);
        a.get(2).add(5);
        System.out.println("Array list is: " + a);

        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int s = sc.nextInt();
            b.add(new ArrayList<Integer>());
            for(int j=0;j<s;j++)
                b.get(i).add(sc.nextInt());
        }
        // System.out.println("Arraylist b is: " + b);
        int q = sc.nextInt();
        for(int i=0;i<q;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y > b.get(x-1).size())
                System.out.println("ERROR!");
            else
                System.out.println(b.get(x-1).get(y-1));
        }
        sc.close();
    }
}
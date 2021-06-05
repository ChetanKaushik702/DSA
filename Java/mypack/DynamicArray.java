import java.util.*;

class DynamicArray {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<n; i++) {
            ll.add(new ArrayList<Integer>());
            ll.get(i).add(i);
        }
        System.out.println(ll);
        ll.remove(ll.get(1));
        for (int i=0; i<ll.size(); i++) {
            for (int j=0; j<ll.get(i).size(); j++)
                System.out.println(ll.get(i).get(j));
        }
    }
}
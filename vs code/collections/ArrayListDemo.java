// Demonstrate ArrayList.
//package collections;
import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        //Create an array list.
        var al = new ArrayList<Integer>();
        System.out.println("Initial size of al: " + al.size());

        //Add elements to the array list.
        for(int i=0;i<10;i++)
            al.add(i);
        var ia = new Integer[al.size()];
        ia = al.toArray(ia);
        System.out.println("Size of al after additions: " + al.size());
        //Display the array list.
        System.out.println("Contents of al: " + al);
        Integer sum = Integer.valueOf("0");
        for (int i = 0; i < ia.length; i++)
            sum += ia[i];
        System.out.println("Sum is: " + sum) ;
        //Remove elements from the array list.
        al.remove(9);
        al.remove(0);
        System.out.println("Size of al after deletions: " + al.size());

        System.out.println("Contents of al: " + al);
    }
}
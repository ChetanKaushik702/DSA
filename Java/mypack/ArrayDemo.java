import java.util.*;

class ArrayDemo {
    public static void main(String[] args) {
        
        Runtime run = Runtime.getRuntime();
        System.out.println("Initial free memory: " +run.freeMemory());
        run.gc(); // invokes garbage collection
        System.out.println("Free memory after invoking garbage collection class: " + run.freeMemory());
        long m1=0, m2=0;
        m1 = run.totalMemory();
        var al = new ArrayList<Integer>();
        
        System.out.println("Initial size of arraylist: " + al.size());
        long beg = System.currentTimeMillis();
        for(int i=0;i<100;i++)
            al.add(0,i);
        long end = System.currentTimeMillis();
        m2 = run.freeMemory();
        System.out.println("Memory used by arraylist: " + (m1-m2));
        System.out.println("Time consumed: " + (end-beg) + "ms");
        al.remove(9);
        //System.out.println(al);

    }
}
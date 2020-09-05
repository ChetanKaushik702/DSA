import java.util.*;

class LeetCode {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(10);
        int[] A = {-1, 0, -1, 2, -3, 4, -4};
        int t=0;
        for(int i=0;i<A.length-2;i++)
            for(int j=i+1;j<A.length-1;j++)
                for(int k=j+1;k<A.length;k++)
                    if(A[i] + A[j] + A[k] == 0) {
                        al.add(new ArrayList<Integer>());
                        al.get(t).add(A[i]);
                        al.get(t).add(A[j]);
                        al.get(t).add(A[k]);
                        t++;
                    }
        //var ll = new LinkedList<Integer>();               
        System.out.println(al);
    }
}
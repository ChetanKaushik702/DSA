import java.util.*;
import java.io.*;

class Subsets {
    // recursive approach
    static int rec(int a[], int total, int i, String s) {
        // base cases
        if (total == 0) {
            System.out.print("[");
            String s_arr[] = s.split(" ");
            for (int t=0; t<s_arr.length-1; t++)  System.out.print(s_arr[t]+", ");
            System.out.println(s_arr[s_arr.length-1]+"]");
            return 1;
        }
        if (i < 0 || total < 0)
            return 0;

        // recursive case    
        if (total < a[i])
            return rec(a, total, i - 1, s);
        else
            return rec(a, total, i - 1, s) + rec(a, total - a[i], i - 1, Integer.toString(a[i]) + " " + s);
    }

    //driver method for rec()
    static int total_subsets(int a[], int total, String s) {
        return rec(a, total, a.length-1, s);
    }
    
    //dynamic programming approach
    static int rec_dp(int a[], int total, int i, String s, Hashtable<String, Integer> mem) {
        String key = Integer.toString(total) + ":" + Integer.toString(i);
        // base cases
        if (mem.get(key) != null) {
            return mem.get(key);
        }
        if (total == 0) {
            System.out.print("[");
            String s_arr[] = s.split(" ");
            for (int t=0; t<s_arr.length-1; t++)  System.out.print(s_arr[t]+", ");
            System.out.println(s_arr[s_arr.length-1]+"]");
            return 1;
        }
        if (i < 0 || total < 0) return 0;
        int result;
        if (total < a[i])
            result = rec_dp(a, total, i-1, s, mem);
        else
            result = rec_dp(a, total, i-1, s, mem) + rec_dp(a, total-a[i], i-1, a[i] + " " + s, mem);
        mem.put(key, result);
        return result;
    }
    static int dp_total_subsets(int a[], int total) {
        Hashtable<String, Integer> mem = new Hashtable<>();
        String s="";
        return rec_dp(a, total, a.length-1, s, mem);
    }


    //main method
    public static void main(String[] args) throws Exception{
        File inp = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Implementation\\input.txt");
        try(Scanner sc = new Scanner(inp)) {
            int n = Integer.parseInt(sc.next());
            int arr[] = new int[n];
            for (int i=0; i<n; i++) arr[i] = Integer.parseInt(sc.next());
            int total = 1000;
            String s="";
            long beg = System.currentTimeMillis();
            System.out.println(dp_total_subsets(arr, total));
            long end = System.currentTimeMillis();
            System.out.println("Time taken by dynamically optimsed recursive approach: " +(end-beg) + "ms.");
            beg = System.currentTimeMillis();
            System.out.println(total_subsets(arr, total, s));
            end = System.currentTimeMillis();
            System.out.println("Time taken by simple recursive approach: " +(end-beg) + "ms.");
        }
    }
}
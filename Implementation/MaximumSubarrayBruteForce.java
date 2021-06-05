import java.util.Scanner;
import java.io.*;
class MaxSubarray {

    static int[] bruteForce(int arr[]) {    
        int res[] = new int[3];
        res[2] = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            int sum = arr[i];
            if (res[2] < sum)   {res[2] = sum;}
            for (int j=i+1; j<arr.length; j++) {
                sum += arr[j];
                if (res[2] < sum) {
                    res[2] = sum;
                    res[1] = j;
                    res[0] = i;
                }
            }
        }
        return res;
    }

    static String[] optimized(int arr[], int low, int high) { // O(nlgn)
        if (low == high) {
            return (low + " " + high + " " + arr[low]).split(" "); 
        }
        
        int mid = (low + high)/2;
        String left[] = optimized(arr, low, mid);
        String right[] = optimized(arr, mid+1, high);
        String cross[] = maximumSubarray(arr, low, mid, high);
        if (Integer.parseInt(left[2]) >= Integer.parseInt(right[2]) &&
            Integer.parseInt(left[2]) >= Integer.parseInt(cross[2]))
            return left;
        else if (Integer.parseInt(right[2]) >= Integer.parseInt(left[2]) &&
        Integer.parseInt(right[2]) >= Integer.parseInt(cross[2]))
            return right;
        else
            return cross;

    }

    static String[] maximumSubarray(int arr[], int low, int mid, int high) {
        int maxLeft = Integer.MIN_VALUE;
        int sum = 0;
        int left = mid-1;
        for (int i=mid; i>=low; i--) {
            sum += arr[i];
            if (maxLeft < sum) {
                maxLeft = sum;
                left = i;
            }
        }
        sum = 0;
        int right = mid+1;
        int maxRight = Integer.MIN_VALUE;
        for (int j=mid+1; j<=high; j++) {
            sum += arr[j];
            if (sum > maxRight) {
                maxRight = sum;
                right = j;
            }
        }
        return (left + " " + right + " " + (maxLeft+maxRight)).split(" ");
    }

    static String linearTimeMaxSumSubarray(int arr[]) {
        int M = Integer.MIN_VALUE;
        int leftm=-1, rightm=-1;
        int Mr = 0;
        int leftr = 0;
        for (int i=0; i<arr.length; i++) {
            Mr += arr[i];
            if (Mr > M) {
                M = Mr;
                leftm = leftr;
                rightm = i;
            }
            if (Mr < 0) {
                Mr = 0;
                leftr = i+1;
            }
        }
        return leftm + " " + rightm + " " + M;
    }
    public static void main(String args[]) {
        File inp = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Implementation\\input.txt");
        try(Scanner sc = new Scanner(inp)) {
            int n = Integer.parseInt(sc.next());
            int arr[] = new int[n];
            for (int i=0; i<n; i++) arr[i] = Integer.parseInt(sc.next());

            long beg = System.currentTimeMillis();
            int ans[] = bruteForce(arr);
            long end = System.currentTimeMillis();
            System.out.println("Time taken by brute force(O(n^2)) algorithm: " + (end-beg)+"ms.");
            System.out.println("Maximum sub-array sum: "+ans[2]+
            "\nInitial index: "+ans[0]+"\nEnding index: "+ans[1]);

            beg = System.currentTimeMillis();
            String rec_ans[] = optimized(arr, 0, n-1);
            end = System.currentTimeMillis();
            System.out.println("Time taken by optimized(O(nlgn)) algorithm: " + (end-beg)+"ms.");
            for (String s: rec_ans)
                System.out.println(s);
            
            beg = System.currentTimeMillis();
            String res = linearTimeMaxSumSubarray(arr);
            end = System.currentTimeMillis();
            System.out.println("Time taken by highly optimized(O(n)) algorithm: " + (end-beg) + "ms.");
            System.out.println(res);
        }catch (FileNotFoundException e) {
            System.out.println("File not found...");
            e.printStackTrace();
        }
    }
}
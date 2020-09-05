//package collections;

import java.util.Scanner;

class MergeSortedArrays {
    static int[] merge(int[] a, int[] b) {
        if(a.length == 0)
            return b;
        if(b.length == 0)
            return a;
       final int[] result = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while(true) {
            if(a[i] <= b[j]) {
                result[k++] = a[i++];
                if(i == a.length)
                    break;
            }else {
                result[k++] = b[j++];
                if(j == b.length)
                    break; 
            }
        }
        if(i == a.length)
            for(;j<b.length;j++)
                result[k++] = b[j];
        else
            for(;i<a.length;i++)
                result[k++] = a[i];
        return result;
    }
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            int[] a, b;
            System.out.print("Enter the size of array1: ");
            int n1 = s.nextInt();
            System.out.print("\nNow, enter the size of array2: ");
            int n2 = s.nextInt();
            a = new int[n1];
            b = new int[n2];
            if(n1 > 0) {
            System.out.println("\nInput the " + n1 + " sorted elements of array1: ");
            for(int i=0;i<n1;i++)
                a[i] = s.nextInt();
            }
            if(n2 > 0) {
            System.out.println("\nInput the " + n2 + " sorted elements of array2: ");
            for(int i=0;i<n2;i++)
                b[i] = s.nextInt();
            }
            int[] merged = merge(a, b);
            System.out.print("Resultant array: [");
            for(int i=0;i<merged.length;i++) {
                if(i < merged.length-1)
                    System.out.print(merged[i] + ", ");
                else
                    System.out.print(merged[i] + "]");
            }
        }
    }
}
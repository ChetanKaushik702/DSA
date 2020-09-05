package algorithms;

import java.util.Scanner;

// Maximum sub-array using brute-force approach
class MaxSubArray {

        public static void main(String[] args) {

            //defining scanner object for taking user input
            try (Scanner sc = new Scanner(System.in)) {

                 //taking size of array from user
                System.out.print("Enter the size of array: ");
                int size = sc.nextInt();

                //defining array of input size
                int[] array = new int[size];

               //taking the array elements as input from the user
               System.out.println("Enter the array elements:");
                for (int i=0; i<array.length; i++)
                    array[i] = sc.nextInt();
                
                int[] subarrIndex = max_subArray(array);

                System.out.print("Maximum sub-array is: [" + array[subarrIndex[0]]);
                for (int i=subarrIndex[0]+1; i<=subarrIndex[1]; i++)
                    System.out.print(", " + array[i]);
                System.out.println("]");
            }
        }

        //max-subarray computing method
        static int [] max_subArray (int A[]) {
                //declaring the array to be returned
                int [] ret = new int[2];
                int [] sum = {Integer.MIN_VALUE, 0};

                //main logic using loops time complexity - O(n*n)
                for (int i=0; i<A.length; i++) {
                    for (int j=i; j<A.length; j++) {
                        sum[1] += A[j];
                        if (sum[0] < sum[1]) {
                            sum[0] = sum[1];
                            ret[0] = i;
                            ret[1] = j;
                        }
                    }
                    sum[1] = 0;
                }
                
                //return array ret[]
                return ret;
        }
}
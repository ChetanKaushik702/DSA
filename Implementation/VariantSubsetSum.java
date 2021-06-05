/* Given a set of non-negative integers, 
** and a value sum, determine if there is a subset of the given set 
** with sum equal to given sum. 
*/
public class VariantSubsetSum {
    //recursive approach
    static boolean findSubset(int a[], int total, int i) {
        // base cases
        if (total == 0) return true;
        if (i < 0)     return false;

        // if a[i] > total, need to reduce our search space
        if (total < a[i]) return findSubset(a, total, i-1);
        else    return findSubset(a, total, i-1) || findSubset(a, total-a[i], i-1);
    }

    // dynamic programming approach
    // Returns true if there is a subset of
    // set[] with sun equal to given sum
    static boolean isSubsetSum(int set[], int sum)
    {   
        int n = set.length;
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[sum + 1][n + 1];
 
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;
 
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;
 
        // Fill the subset table in botton
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j]
                                   || subset[i - set[j - 1]][j - 1];
            }
        }
 
        /* // uncomment this code to print table
        for (int i = 0; i <= sum; i++)
        {
        for (int j = 0; j <= n; j++)
            System.out.println (subset[i][j]);
        } */
 
        return subset[sum][n];
    }
    //driver code
    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int total = 41;
        System.out.println(findSubset(set, total, set.length-1));
        System.out.println(isSubsetSum(set, total));
    }
}

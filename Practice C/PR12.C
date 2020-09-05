/*This program checks and reports whether sum of elements in the ith row of a 5X5 array is equal to sum of elements in ith column.*/

#include <stdio.h>

int main()
{
    int m=5, n=5, sum_row=0,sum_col=0;
    int a[m][n] = {
                    {1,2,3,4,5},
                    {2,3,4,5,1},
                    {3,4,5,1,2},
                    {4,5,1,2,3},
                    {5,1,2,3,4}

                  };

                  for(int i=0;i<5;i++)
                  {
                      for(int j=0;j<5;j++)
                      {
                          sum_row += a[i][j];
                          sum_col += a[j][i];
                      }
                      if(sum_row == sum_col)
                        printf("Sum of row%d is equal to that of column%d.\n",i+1,i+1);
                  }
    return 0;
}

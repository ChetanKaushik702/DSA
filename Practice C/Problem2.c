// This sorts an array on the basis of a given array
#include <stdio.h>

int abs(int a)
{
    if(a >= 0)
        return a;
    else
        return -a;
}
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{
                    int t=0, count=0, b[] = {2, 1, 8, 3};
                    int a[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};

                    int m = sizeof(b)/sizeof(int), n = sizeof(a)/sizeof(int);

                    for(int i=0;i<m;i++)
                    {

                        for(int j=i;j<n;j++)
                        {
                            int k = t;
                            if(b[i] == a[j])
                            {
                                count++;
                                swap(&a[k],&a[j]);
                                t++;
                            }
                        }
                    }


                if (m != n){
                    for(int i=count;i<n;i++)
                    {
                        for(int j=i+1;j<n;j++)
                        {
                            if(a[i] > a[j])
                                swap(&a[i],&a[j]);
                        }
                    }
                }

                    printf("Desired array is: ");
                    for(int i=0;i<n;i++)
                        printf("%d ",a[i]);


    return 0;
}

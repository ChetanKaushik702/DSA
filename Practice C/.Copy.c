//This program sorts an array on the basis of the product of their digits
#include <stdio.h>
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}
int main()
{
	int a[] = {10,123,19,0,12,13};
	int n = sizeof(a)/sizeof(12);//n = 3

	#ifdef M
	int *p[n];//pointer to an array of pointers

	//Copying the addresses of array elements in array of pointers
	for(int i=0;i<n;i++)
	    p[i] = (a + i);
    #endif // M
	int t[n], b, prod = 1;
	for(int i=0;i<n;i++)
    {
        b = a[i];
        while(b != 0)
        {
            prod *= (b % 10);
            b /= 10;
        }
        t[i] = prod;
        prod = 1;
    }

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(t[j] > t[j+1])
            {
                swap(&t[j],&t[j+1]);
                swap(&a[j],&a[j+1]);
            }
        }
    }

    for(int i=0;i<n;i++)
        printf("%d ",a[i]);


	return 0;
}

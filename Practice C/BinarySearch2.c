/*Binary Search Algorithm*/
#include <stdio.h>
void binarysearch(int [],int ,int ,int );
void swap(int *x,int *y)
{
	int temp = *x;
		  *x = *y;
		  *y = temp;
}
void bubblesort(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			if(arr[j] > arr[j+1])
				swap(&arr[j],&arr[j+1]);
		}
	}
}
int main()
{
	int n,num;
	printf("Enter size of array: "); scanf("%d",&n);
	int a[n];
	printf("Enter %d elements of array:\n",n);
	for(int i=0;i<n;i++)
		scanf("%d",&a[i]);

	bubblesort(a,n);
	printf("Enter an integer to know if it is present in array or not: ");
	scanf("%d",&num);
	binarysearch(a,0,n-1,num);

	return 0;
}
void binarysearch(int arr[],int p,int q,int number)
{
	int indicator = 0;
	while(p <= q)
	{
		int m = (p+q)/2;
		if(arr[m] == number)
		{
		    indicator = 1;
		    break;
		}
		else
		{
			if(number > arr[m])
				p = m+1;
			else
				q = m-1;
		}
	}
	indicator == 0 ? printf("%d is not present in the array.",number):printf("%d is present in the array.",number);
}

/*Selection Sort Algorithm*/
#include <stdio.h>
void swap(int *, int *);
void selSort(int [], int);
void arrDisplay(int [], int);

int main()
{
	int arr[] = {2,1,-3,-10,260,-2};
	int n = sizeof(arr)/sizeof(int);
	selSort(arr,n);
	arrDisplay(arr,n);

	return 0;
}
void selSort(int arr[], int size)
{
	int i,j;
	for(i=0 ;i<size-1; i++)
	{	
		for(j=i+1 ;j<size; j++)
		{
			if(arr[i] > arr[j])
				swap(&arr[i],&arr[j]);
		}
	}
}
void swap(int *a, int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
void arrDisplay(int arr[], int size)
{
	printf("Sorted array is: ");
	for(int i=0;i<size;i++)
		printf("%d ",arr[i]);
	printf("\n");
}
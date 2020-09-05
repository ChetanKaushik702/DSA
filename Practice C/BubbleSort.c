/*Bubble Sort Algorithm*/
#include <stdio.h>
void swap(int *, int *);
void printarray(int [],int );
void bubblesort(int [],int );

int main()
{
	int arr[] = {5,1,4,2,3};
	int n = sizeof(arr)/sizeof(arr[0]);
	bubblesort(arr,n);
	printf("Sorted array: ");
	printarray(arr,n);

	return 0;
}

void swap(int *x,int *y)
{
	int temp = *x;
	*x = *y;
	*y = temp;
}

void bubblesort(int arr[], int size)
{
	int i,j;
	for(i=0;i<size-1;i++)
	{
		for(j=0;j<size-i-1;j++)
		{
			if(arr[j] > arr[j+1])
				swap(&arr[j],&arr[j+1]);
		}
	}
}

void printarray(int arr[], int dim)
{
	for(int i=0;i<dim;i++)
		printf("%d ",arr[i]);
	printf("\n");
}
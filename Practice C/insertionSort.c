/*Insertion Sort Algorithm */
#include <stdio.h>

void insertionSort(int [], int );
void displayArray(int [], int);

int main()
{
	int arr[] = {10,-2,-34,2,-19};
	int size = sizeof(arr)/sizeof(int);
	insertionSort(arr,size);
	displayArray(arr,size);

	return 0;
}
void displayArray(int arr[],int size)
{
	int i=0;
	printf("Sorted array is: ");
	for(;i<size;i++)
		printf("%d ",arr[i]);
}
void insertionSort(int arr[], int size)
{
	int i,key,j;
	for(i=1;i<size;i++)
	{
		key = arr[i];
		j = i-1;
		while(j>=0 && key < arr[j])
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
}
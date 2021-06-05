// This program computes the second greatest element in the array.
#include <stdio.h>
#include <limits.h>
#define SIZE 7

int main() {

			//declaring array
			int arr[SIZE];

			printf("Enter %d elements in the array: ", SIZE);
			for (int i=0; i<sizeof(arr)/sizeof(int); i++)
				scanf("%d", &arr[i]);
			int max1 = INT_MIN, max2 = INT_MIN;

			//finding the largest element in the array
			for (int i=0; i<SIZE; i++)
				if (max1 < arr[i])
					max1 = arr[i];

			//finding the second largest element in the array
			for (int i=0; i<SIZE; i++) {
				if (arr[i] == max1)
					continue;
				if (arr[i] > max2)
					max2 = arr[i];
			}

			printf("The second largest element in the array is %d.\n", max2);
			
	return 0;
}
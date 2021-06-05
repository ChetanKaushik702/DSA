// This is recursive version of Binary Search implementation
#include <stdio.h>
#define SIZE 10
int binarySearch (int *, int );
int main() {

		//declaring array
		int arr[SIZE];
		printf ("Enter %d elements in the array(in sorted manner): ", SIZE);

		for (int i=0; i<SIZE; i++) 
			scanf("%d", &arr[i]);

		int value;
		printf("Enter the value you want to search in the array: ");
		scanf("%d", &value);

		int isValueFound = binarySearch(arr, value); 
		if (!isValueFound)
			printf("%d is not present in the array.\n", value);
		else
			printf("%d is present in the array at position %d.\n", value, isValueFound);

	return 0;
}

int binarySearch (int *p, int value) {
		static int beg = 0, end = SIZE-1;
		if (beg <= end) {
			int mid = (beg + end) / 2;
			if (*(p+mid) == value) {
				return mid+1;
			}
			else if (*(p+mid) < value) {
					beg = mid + 1;
					binarySearch (p, value);
			} 
			else {
					end = mid - 1;
					binarySearch (p, value);
			}
					
		}else
			return 0;
}
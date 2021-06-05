// Inserting an element in an array at a specified location
#include <stdio.h>
#include <stdbool.h>
#define MAX 20
int main() {
			//declaring an array of size MAX
			int arr[MAX];
			int size = 18;
			printf("Enter %d elements of array: ", size);
			//scanning input
			for (int i=0; i<size; i++)
				scanf("%d", &arr[i]);

			//prompting user to enter element to be inserted at a specified position
			int element, pos, stop;

				do {
					printf("Enter element and its position of insertion in the array: ");
					scanf("%d %d", &element, &pos);

					for (int i=size-1; i>=pos-1; i--) 
						arr[i+1] = arr[i];
	
					arr[pos-1] = element;
					size++;
					//displaying array elements
					printf("Array: [%d", arr[0]);
					for (int i=1; i<size; i++)
						printf(", %d", arr[i]);
					printf("]");

					if (size == 20) {
						printf("No more elements can be inserted in the array.");
						break;
					}

					printf("\nDo you want to stop?(Enter 1 for Yes or 0 for No)\n");
					scanf("%d", &stop);
					printf("\n");
				} while (stop > 0 && stop <= 1);

			printf("Exit.");
	return 0;
}
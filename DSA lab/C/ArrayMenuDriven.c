// Menu-driven program for arrays
#include <stdio.h>

int main() {

				//defining the array 
				int arr[20];
				int size, inputIndicator = 0;
				int choice;
				//describing menu
				do {
						printf("Enter 1 to input array elements.\n");
						printf("Enter 2 to display array elements.\n");
						printf("Enter 3 to insert an element in array at a specified position.\n");
						printf("Enter 4 to delete an element in array at a specified position.\n");
						printf("Enter 0 to stop.\n");

						scanf("%d", &choice);

						switch (choice) {
								case 0:
									printf("Successful exit.\n");
								break;
								case 1:
									size = 2;
									printf("Enter %d elements in array: ", size);
									for (int i=0; i<size; i++)
										scanf("%d", &arr[i]);
									inputIndicator = 1;
								break;

								case 2:
									if (!inputIndicator) {
										printf("ERROR!!Input array elements first.\n");
										break;
									}
									if (size == 0) {
										printf("Empty array.\n");
										break;
									} 

								  	 printf("Array is : [%d", arr[0]);
								  	 for (int i=1; i<size; i++)
								  	 	printf(", %d", arr[i]);
								  	 printf("]\n");
								break;

								case 3:
									if (!inputIndicator) {
										printf("ERROR!!Input array elements first.\n");
										break;
									}
								  	 if (size == 20) {
								  	 	printf("ERROR!!Not more than %d elements can be inserted in array.\n", size-10);
								  	 	break;
								  	 }
								  	 int element, pos;
								  	 printf("Enter the element and its position to insert in the array: ");
								  	 scanf("%d %d", &element, &pos);

								  	 //inserting at the desired position
								  	 for (int i=size-1; i>=pos-1; i--)
								  	 	  arr[i+1] = arr[i];
								  	 arr[pos-1] = element;
								  	 size++;
								break;

								case 4:
								   	if (!inputIndicator) {
										printf("ERROR!!Input array elements first.\n");
										break;
									}
								   	if (size == 0) {
								   		printf("ERROR!!Array is already empty.\n");
								   		break;
								   	}
								 	int loc;
								   	printf("Enter the position of element for deletion: ");
								   	scanf("%d", &loc);

								   	for (int i=loc-1; i<size; i++)
								   		arr[i] = arr[i+1];
								   	size--;
								break;
							default:
								printf("ERROR!!Please enter a valid choice.\n");
						}
					printf("\n");
				} while (choice != 0);

	return 0;
}
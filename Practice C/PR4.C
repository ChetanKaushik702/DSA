/*Input 3 numbers and determine if they form Pythagorean Triplet or not */
#include <stdio.h>
#define SIZE 3
int main()
{
	int num[SIZE];
	printf("Enter 3 integers:\n");
	scanf("%d %d %d",&num[0],&num[1],&num[2]);

	/*Arranging these elements in ascending order */
	for(int i=1;i<SIZE;i++)
	{
		int key = num[i];
		int j = i-1;

			while(j>=0 && key < num[j])
			{
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = key;
	}

	if(((num[0]*num[0]) + (num[1]*num[1])) == num[2]*num[2])
		printf("(%d, %d, %d) is a Pythagorean triplet.",num[0],num[1],num[2]);
	else
		puts("The entered numbers do not form a Pythagorean triplet.");

	return 0;
}
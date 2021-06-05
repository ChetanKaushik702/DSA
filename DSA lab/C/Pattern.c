//Simple pattern to draw.
#include <stdio.h>

int main(int argc, char const *argv[])
{
	/* code */
	int limit;

	printf("Enter the limit upto which you want to print the pattern: ");

	scanf("%d", &limit);

	for(int i=1; i<=limit; i++) {

		for(int j=i; j>0; j--) {
			printf("*");
		}
		printf("\n");
	}
	
	
	return 0;
}
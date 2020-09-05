/* Range of a set of numbers of numbers that are input through the keyboard */
#include <stdio.h>
#include <limits.h>
int main()
{
	int min = INT_MAX, max = INT_MIN;
	int num;

	printf("Enter data:\n");
	while((scanf("%d",&num)))
	{
		if(num == 0)
			break;
		if(num > max)
			max = num;
		if(num < min)
			min = num;
	}
	printf("Range is %d.",max-min);
		return 0;
}

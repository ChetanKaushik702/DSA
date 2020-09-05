//This program sorts an array on the basis of the product of their digits
#include <stdio.h>
int main()
{
	int a[] = {12, 14, 11};
	int n = sizeof(a)/sizeof(12);//n = 3

	int *p[n];//an array of pointers

	//Copying the address of array elemnts in array of pointers 
	for(int i=0;i<n;i++)
	{	(p + i) = (a + i);
		printf("%u \n",(p+i));
	}

	return 0;
}
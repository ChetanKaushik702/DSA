/*This program prints the sizes of all types of chars, ints and rels*/
#include <stdio.h>


int main()
{
	printf("Size of short is %2dbytes.\n",sizeof(short));
	printf("Size of int is %4dbytes.\n",sizeof(int));
	printf("Size of long is %3dbytes.\n",sizeof(long));
	printf("Size of char is %3dbyte.\n",sizeof(char));
	printf("size of double is %dbytes.\n",sizeof(double));
	printf("Size of float is %2dbytes.\n",sizeof(float));
	//printf("size of double is (%d,%d).\n",)
} 
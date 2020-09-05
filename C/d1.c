#include <stdio.h>
int main()
{
	char ch[] = "String";
	char *p = ch;
	printf("%u",p);
	p = ch - 1;
	printf("\n%u",p);
	return 0; 
}
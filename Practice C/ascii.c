/*ASCII values of all charcters*/
#include <stdio.h>
int main()
{
	int ch;
	for(ch = -128; ch <= 127; ch++)
		printf("ASCII VALUE: %d  CHARACTER: %c\n",ch,ch);
	
	return 0;
}
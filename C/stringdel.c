/* This is a program to delete a sub-string from a strinng*/
#include <stdio.h>
#include <string.h>
int main()
{
	char str[100], del[100];
	printf("Enter a string: "); gets(str);
	printf("Enter sub-string for deletion: "); gets(del);
	int i=0;
	char *p = del;
	while(str[i] != '\0')
	{
		if(str[i] == *p)
		{
			for(unsigned int j=i;j<strlen(str)-1;j++)
				str[j] = str[j+1];

			p++;
			if(*p != '\0')
				continue;
		}
		
		i++;
	}
	for(unsigned int i=0;i<(strlen(str) - strlen(del));i++)
		printf("%c",str[i]);
	return 0;
}
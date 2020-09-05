/* This program deals with adding an element to a string at the specified position */
#include <stdio.h>
#include <string.h>

int main()
{
	char s1[1200]; char s2[200];

	printf("Size of s1 = %d\nSize of s2 = %d\n",sizeof(s1),sizeof(s2));
	
	puts("Enter source string:");
	gets(s1);
	
	puts("Enter string to add:");
	gets(s2); 
	int temp1 = strlen(s1), temp2 = strlen(s2);
	int i, pos; char *j;
	printf("Now, enter position at which this string is to be added: ");
	scanf("%d",&pos);

	for(i=strlen(s1),j=(s2+strlen(s2)-1);i>=pos;i--)
	{
		
		if(i==pos)
		{
			s1[pos]= *j;
			j--;
			i=strlen(s1);
			
		}
		if(j == s2-1)
			break;
		
			s1[i] = s1[i-1];
			
	}
	i=-1;
	while(i++<(temp1 + temp2 - 1))
		printf("%c",s1[i]);

	return 0;
}
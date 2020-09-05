/* This program checks the occurance of a sub-string in a string */
#include <stdio.h>
int main()
{
	char main_str[80];
	char sub_str[79];
	static int i, flag, count;
	puts("Enter string:");
	gets(main_str);
	puts("Enter sub-string:");
	gets(sub_str);

	char *p = sub_str;

	while(main_str[i] != '\0')
	{
		if(main_str[i] == *p)
		{
			//p++; i++;
			while(*p !='\0')
			{
				if(*p != main_str[i])
				{
					flag = 1;
					break;
				}
				i++;
				p++;
			}
			if(flag == 0)
			{
				count++;
				p = sub_str;
			}
			flag = 0;
			i--;
		}
		i++;
	}
	printf("Number of occurances is %d.",count);

	return 0;
} 
#include <stdio.h>
#include <string.h>
int main()
{
	char str[25] = "Chetannateh" ;
	
	int i = 0, j = strlen(str) - 1,flag = 1;

	while(i <= j)
	{
		if(str[i] != str[j])
		{
			flag = 0;
			break;
		}
		i++;
		j--;
	}
	flag ? printf("%s is a pallindrome.",str) : printf("%s is not a pallindrome.",str);

	return 0; 
}
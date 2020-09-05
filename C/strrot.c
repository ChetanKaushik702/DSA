/* This program deals with circular rotation of a string */
#include <stdio.h>
#include <string.h>
int main()
{
	char s_rot[120],rot[120];
	puts("Enter a string for rotation:");
	gets(s_rot);
	strcpy(rot,s_rot);
	//char *p1=s_rot,*p2=rot;

	int i=0;
	while(1)
	{
		char var = s_rot[i];
		for(unsigned int j=0;j<(strlen(s_rot)-1);j++)
		{
			s_rot[j] = s_rot[j+1];
		}
		s_rot[strlen(s_rot)-1] = var;

		if(!(strcmp(rot,s_rot)))
			break;
		printf("%s\n",s_rot);
		
	}
	return 0;
}
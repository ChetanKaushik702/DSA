/* A multi-
line 
comment*/
#include <stdio.h>
#include <conio.h>
struct detail
{
	int age; long  Mob_no;
};
int main()
{
	typedef struct detail emp;
	emp e;
	printf("Enter your age and mobile number:\n");
	scanf("%d %ld",&e.age,&e.Mob_no);

	printf("You entered:\nAge : %dyears\nMobile number : %ld\n",e.age,e.Mob_no);
	getch();
	return 0;
}
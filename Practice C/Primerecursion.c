// Prime factors using recursion
#include <stdio.h>
void factorise(int n, int a)
{
	if(a <= n)
	{
		if(n % a == 0)
		{
			printf("%d ",a);
			n /= a;
		}
		else
			a++;
		factorise(n, a);
	}
}
int main()
{
	int num;
	printf("Enter a positive number: ");	scanf("%d",&num);

	printf("Prime factors of %d are : ",num);
	factorise(num, 2);

	return 0;
}
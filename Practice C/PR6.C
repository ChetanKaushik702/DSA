/*This program defines a recursive function to calculate prime factors of a number*/
#include <stdio.h>
#include <math.h>

int factors(int, int);
void prime(int);

int main()
{
	int num, holder;/*holder for holding the value returned from function factors*/
	printf("Enter a number: ");
	scanf("%d",&num);
	if(num == 2)
		printf("%d is a prime number.",num);
	else
	{	
		if(num > 2)
		{
			holder = factors(num, num);

			if(!holder)
				printf("Either the number is a prime number or it can't be further prime factorized.");
			else
				printf("%d is a prime factor.",holder);
		}
		else
			printf("Error!! Invalid number.");
	}
	return 0;
}

int factors(int num, int a)
{
	a -= 1;
	if(a == 2)
	{
		if(num % a == 0)
			return 2;
		else
			return 0;
	}
	else
	{
		if(num % a == 0)
		{
			prime(a);
			factors(num,a);
		}	
		else
			factors(num,a); 
	}
}

void prime(int n){
	int i,flag=0;

	for(i=2;i<=sqrt(n);i++)
	{
		if(n % i == 0)
		{
			flag = 1;
			break;
		}
	}
	if(!flag)
		printf("%d is a prime factor.\n",n);
}
/*This program calculates the sum of the series: 1!2! + 2!3! + .... + 9!10! */
#include <stdio.h>
int factorial(int);

int main()
{
	int i=0;
	long sum=0;
	for(;i++ < 9;)
		sum += factorial(i)*factorial(i+1);
	printf("Sum of the required series is %ld",sum);

	return 0;
}

int factorial(int n)
{
	int fact=1;
	for(int i=n;i>0;i--)
		fact *= i;
	return(fact);
}
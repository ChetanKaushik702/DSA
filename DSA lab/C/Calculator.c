// Implementation of calculator using switch-case statements.
#include <stdio.h>
#include <stdlib.h>
int main() {
	float a, b;
	printf("Enter two operands: ");
	scanf("%f %f", &a, &b);
	fflush(stdin);
	char ch;
	printf("Enter an operator(+, -, *, /): ");
	scanf("%c",&ch);

	switch(ch) {
		case '+':
			printf("%.1f + %.1f = %.1f\n", a, b, a+b);
			break;
		case '-':
			printf("%.1f - %.1f = %.1f\n", a, b, a-b);
			break;
		case '*':
			printf("%.1f x %.1f = %.1f\n", a, b, a*b);
			break;
		case '/':
			if(b != 0)
				printf("%.1f / %.1f = %.1f\n", a, b, a/b);
			else
				printf("Division by zero is not allowed.");
			break;
		default:
			printf("ERROR! Invalid operator.");
	}

	return 0;
}
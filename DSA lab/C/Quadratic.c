// Program to find roots of a quadratic equation
#include <stdio.h>

int main() {
			//Taking a, b and c as input from the user
			float a, b, c;
			printf("Enter quadratic equations a, b and c(a should not 0): ");
			scanf("%f %f %f", &a, &b, &c);

			//For a = 0, equation becomes linear
			if(!a)
				printf("Equation is not quadratic.\n");
			else {

					float sumOfRoots = -b/a, prodOfRoots = c/a, rootsExist = 0, r1, r2;

					if(!c)
						printf("Roots are: %0.2f and %0.2f\n", 0.0, sumOfRoots);
					else {

							//Finding the roots, if they exist
							for (r1=0.001; r1<=prodOfRoots; r1 += 0.001) {
								float poss_r2 = prodOfRoots/r1;

								//checking for sum of roots
								if (r1 + poss_r2 == sumOfRoots) {
									r2 = poss_r2;
									rootsExist = 1;
									break;
								}
								if(-r1 - poss_r2 == sumOfRoots) {
									r2 = -poss_r2;
									r1 = -r1;
									rootsExist = 1;
									break; 
								}
							}

						if (!rootsExist)
							printf("Real roots don't exist.\n");
						else if (rootsExist)
								printf("Roots are: %0.2f and %0.2f\n", r1, r2);
					}
			} 

	return 0;
}
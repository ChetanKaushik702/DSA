/* Writes macros for calculating area and circumference of circle, volume of cone and volume of sphere*/
#include <stdio.h>
#define PI 3.14
#define AREAOFCIRCLE(r) (PI*r*r)
#define CIROFCIRCLE(r) (2*PI*r)
#define VOLOFCONE(r,h) (PI*r*r*h/3)
#define VOLOFSPHERE(r) (4*PI*r*r*r/3)

int main()
{
	float r_circle,r_cone,r_sphere,h_cone;
	printf("Enter radii of circle and sphere, respectively\n");
	scanf("%f %f",&r_circle,&r_sphere);
	printf("Enter radius and height of cone:\n");
	scanf("%f %f",&r_cone,&h_cone);

	printf("Area of circle(radius %f) = %f\nCircumference of circle(radius %f) = %f\nVolume of cone(radius %f, height %f) = %f\nVolume of sphere(radius %f) = %f\n",r_circle,AREAOFCIRCLE(r_circle),r_circle,CIROFCIRCLE(r_circle),r_cone,h_cone,VOLOFCONE(r_cone,h_cone),r_sphere,VOLOFSPHERE(r_sphere));

	return 0;

}
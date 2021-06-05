// Demonstration of logical operators
#include <iostream>
using namespace std;

int main() {
    
    double weight, height;
    // Enter your weight and height(in metres)
    cout << "Enter your weight and height(in metres): ";
    cin >> weight >> height;
    
    // computing BMI(Body mass index)
    double bmi = weight / (height * height);

    cout << "Your BMI is: " << bmi << endl;

    // reporting your BMI category
    cout << "Your BMI category is: ";
    if (bmi < 15)
        cout << "Starvation" << endl;
    else if (bmi >= 15 && bmi < 17.5)
        cout << "Anorexic" << endl;
    else if (bmi >= 17.5 && bmi < 18.5)
        cout << "Underweight" << endl;
    else if (bmi >= 18.5 && bmi < 24.9)
        cout << "Ideal" << endl;
    else if (bmi >= 24.9 && bmi < 25.9)
        cout << "Overweight" << endl;
    else if (bmi >= 25.9 && bmi < 30.9)
        cout << "Obese" << endl;
    else
        cout << "Morbidly Obese" << endl; 
    return 0;   
}
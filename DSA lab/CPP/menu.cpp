#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int choice;
    do {
        cout << "Enter 1 to compute factorial" << endl;
        cout << "Enter 2 to check whether a number is prime or composite" << endl;
        cout << "Enter 3 to check if a number is odd or even" << endl;
        cout << "Enter 4 to check whether a number is divisible by 3 or not" << endl;
        cout << "Enter 0 to exit" << endl;

        cin >> choice;
        switch(choice) {
            case 1: {
                int num;
                cout << "Enter a non-negative integer: ";
                cin >> num;
                long fact = 1;
                for (int i=2; i<=num; i++)
                    fact *= i;
                cout << num << "! = " << fact << endl;
                break;
            }

            case 2: {
                int num;
                cout << "Enter a positive integer: ";
                cin >> num;
                bool indic = 1;
                for (int i=2; i<=sqrt(num); i++)
                    if (num % i == 0) {
                        indic = 0;
                        break;
                    }
                (indic == 1) ? cout << num << " is prime." << endl : cout << num << " is composite." << endl;
                break;
            }
            case 3: {
                int num;
                cout << "Enter an integer: ";
                cin >> num;
                int div = num / 2;
                int rem = num - div*2;
                (rem == 0) ? cout << num << " is even." << endl : cout << num << " is odd." << endl;
                break;
            }
            case 4: {
                int num;
                cout << "Enter an integer: ";
                cin >> num;
                int copyNum = num;
                int sum = 0;
                while(num) {
                    sum += num%10;
                    num /= 10;
                }
                (sum % 3 == 0) ? cout << copyNum << " is divisible by 3.\n" : cout << copyNum << " isn\'t divisible by 3.\n";
                break; 
            }
            default:
                cout << "Error!! Please enter a valid choice." << endl;
        }
        cout << "\n";
    }while(choice);

}
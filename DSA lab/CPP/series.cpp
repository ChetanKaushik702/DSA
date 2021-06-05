/* Printing the answer of the series: 1/1! + 2/2! + 3/3! + ... + n/n! */
#include <iostream>
using namespace std;

int main() {

    int n;
    cout << "Enter the value of n: " ;
    cin >> n;
    double series = 0;
    double fact = 1; 
    int r = 1;      // initialisation
    while(r <= n) { // checks condition
        series +=  r / fact;
        fact *= (r + 1);
        r++;        // updating the loop-control variable
    }
    cout << "Answer: " << series << endl;

    return 0;
}
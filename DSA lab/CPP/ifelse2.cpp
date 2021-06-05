#include <iostream>
using namespace std;

int main() {

    int a = 1, b = 3, c;
	c = b <<  a;            // c = 3 << 1 (0011 << 1 = 0110) = 6
    cout << "Initial values of:\n";
    cout << "a: " << a << "\nb: " << b << "\nc: " << c << endl;

	b = c * (b * (++a)--);  // b = 6 * ( 3 * 2) = 36
    cout << "Now, b = " << b << " and a = " << a << endl;

	a = a >> b;             // a = 1 >> 36 = 0
    cout << "Final value of a = " << a << endl;

    return 0;
}
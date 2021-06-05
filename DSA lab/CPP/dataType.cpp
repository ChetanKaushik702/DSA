// including the standard input-output header file
#include <iostream>
// using the builtin namespace "std"
using namespace std;

int main () {
    int a;
    char ch;
    float flt;
    double dbl;
    cout << "Enter an integer, charcter, floating-point and double number, respectively:\n";
    cin >> a >> ch >> flt >> dbl;
    cout << "Size of: " << a << " is " <<  sizeof(a) << "bytes\nSize of:"<< ch << " is " << sizeof(ch) << "bytes\nSize of:" <<
            flt << " is " << sizeof(flt) << "bytes\nSize of:" << dbl << " is " << sizeof(dbl) << "bytes";
    cout << endl;
}

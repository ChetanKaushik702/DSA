#include <iostream>
using namespace std;

int main() {
    int x, y; 
    x = 10;     // x = 10
    y = 20;     // y = 20 
    x = x + y;  // x = 30 (10 + 20)
    y = x - y;  // y = 10 (30 - 20)
    x = x - y;  // x = 20 (30 - 10)

    x = x * y;  // x = 200 (20*10)
    y = x / y;  // y = 20  (200 / 10)
    x = x / y;  // x = 10  (200 / 20)

    int z;
    z = x % y;  // z = 10 (Remainder when 10 is divided by 20 is 10)
    cout<< (5%2) << endl; 
}
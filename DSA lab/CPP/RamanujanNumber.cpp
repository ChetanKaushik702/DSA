#include <iostream>
using namespace std;

int main() {

    int n;
    cout << "Enter the limit: " ;
    cin >> n;

    for (int a=1; a<=n; a++) {
        long a3 = a * a * a;
        if (a3 > n)
            break;
        for (int b=a; b<=n; b++) {
            long b3 = b * b * b;
            if (a3 + b3 > n)
                break;
            for (int c=a+1; c<=n; c++) {
                long c3 = c * c * c;
                if (c3 > a3 + b3)
                    break;
                for (int d=c; d<=n; d++) {
                    long d3 = d * d * d;
                    if (c3 + d3 > a3 + b3)
                        break;
                    else if (a3 + b3 == c3 + d3) {
                        cout << a << "^3 + " << b << "^3 = " << (a3 + b3);
                        cout << "\t\t" << c << "^3 + " << d << "^3 = " << (a3 + b3) << endl;
                    }
                }
            }
        }
    }

}
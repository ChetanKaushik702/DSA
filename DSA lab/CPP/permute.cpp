#include <iostream>
using namespace std;

int main() {
    
    for (int i=1; i<=3; i++) {
        for (int j=1; j<=3; j++) {
            if(i == j)
                continue;
            for (int k=1; k<=3; k++) {
                if(k == j || k == i)
                    continue;
                cout << i << " " << j << " " << k << endl;
            }
        }
    }
}
#include <iostream>
using namespace std;

int main() {

    int n;
    cout << "Enter n: ";
    cin >> n;
    // multiple initialisations, conditions and incrementations are allowed in for loops
    for (int i=1, j=2, k=3; i <= n && j <= n+1 && k <= n+2; i++, j++, k++) 
        cout << i << " " << j << " " << k << endl;
    
    return 0;
}
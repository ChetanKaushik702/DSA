#include <iostream>
using namespace std;
typedef long long ll;

int main() {
    ll n;
    cin >> n;
    if (n == 1) cout << 1 << endl;
    else if (n == 2 || n == 3) cout << "NO SOLUTION" << endl;
    else {
        for (int i=2; i<=n; i+=2)   cout << i << " ";
        for (int j= 1; j<=n; j+=2)  cout << j << " ";
    }
}
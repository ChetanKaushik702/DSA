#include <iostream>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    ll t;
    cin >> t;
    while(t--) {
        ll r, c;
        cin >> r >> c;
        if (r%2 == 0 && r >= c) cout << r*r - c + 1 << endl;
        else if (r%2 == 1 && r >= c) cout << (r-1)*(r-1) + c << endl;
        else if (c%2 == 1 && c >= r) cout << c*c - r + 1 << endl;
        else if (c%2 == 0 && c >= r) cout << (c-1)*(c-1) + r << endl;
    }
}
#include <iostream>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    ll n;
    cin >> n;
    ll k = 1;
    while (k <= n) {
        cout << k*k*(k*k-1)/2 - 4*(k-1)*(k-2) << endl;
        k++;
    }
}
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    ll t;
    cin >> t;
    while(t--) {
        ll a, b;
        cin >> a >> b;
        if (!a && !b)   cout << "YES\n";
        else if ((2*a-b)%3 == 0 && (2*b-a)%3 == 0 && a && b && a <= 2*b && b <= 2*a) cout << "YES\n";
        else cout << "NO\n";
    }
}
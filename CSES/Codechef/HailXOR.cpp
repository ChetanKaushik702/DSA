#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll powerof2(ll);
void solver(ll [], ll , ll);

ll powerOf2(ll n) {
    ll power = 0;
    while (n) {
        if (n == 1)
            break;
        power++;
        n = n >> 1;
    }
    return power;
}

void solver(ll a[], ll n, ll x) {
    ll i=0, j=i+1;
    while (x > 0) {
        for (;i<n; i++) {
            if (a[i] != 0)
                break;
        }
        for (; j<n; j++) {
            if (a[j] != 0) {
                break;
            }
        }
        ll p = powerOf2(a[i]);
        a[i] = a[i] ^ (1 << p);
        a[j] = a[j] ^ (1 << p);
        x--;
    }
} 

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    ll t;
    cin >> t;
    while (t--) {
        ll n, x;
        cin >> n >> x;
        ll a[n];
        for (ll i=0; i<n; i++) cin >> a[i];
        solver(a, n, x);
        for (int i=0; i<n-1; i++) cout << a[i] << " ";
        cout << a[n-1] << "\n";
    }
}
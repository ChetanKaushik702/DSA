#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll pascaltriangle(ll i, ll j) {
    if (j == 1 || j == i)
        return 1;
    return pascaltriangle(i-1, j-1) + pascaltriangle(i-1, j);
}

int main() {
    cout << pascaltriangle(5, 3) << endl;
}
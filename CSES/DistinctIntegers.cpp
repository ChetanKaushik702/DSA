#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    set<int> s;
    cin >> n;
    while(n--) {
        int x;
        cin >> x;
        s.insert(x);
    }
    cout << s.size();
}
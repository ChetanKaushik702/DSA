#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

set<string> st;
void permute(string s, int l, int r) {
    if (l == r) {
        // cout << s << endl;
        st.insert(s);
    }
    else {
        for (int i=l; i<=r; i++) {
            swap(s[l], s[i]);

            //recursive step
            permute(s, l+1, r);

            //backtrack
            swap(s[l], s[i]);
        }
    }
}

void swap(char *c1, char *c2) {
    char c = *c1;
    *c1 = *c2;
    *c2 = c;
}

ll fact(ll n) {
    ll ans = 1;
    while (n-- != 1)
        ans *= n;
    return ans;
}
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    cin >> s;
    // cout << fact(8) << endl;
    permute(s, 0, s.size()-1);
    cout << st.size() << "\n";
    for (auto itr=st.begin(); itr!=st.end(); itr++)
        cout << *itr << "\n";
}
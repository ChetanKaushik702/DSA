#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define vll vector<long long>
#define f(i,s,e) for(long long int i=s; i<e; i++)
#define cf(i,s,e) for(long long int i=s; i<=e; i++) 

ll dp[4020][4020];
ll pref[4020];

ll Dfn(ll idx, ll taken, ll n, ll k, vll &arr) {
    if(taken>=k and (pref[idx]-taken)>=k)   return 0;
    else if (idx >= n)  return 1e10;
    else if (dp[idx][taken] != -1)  return dp[idx][taken];

    ll c1 = Dfn(idx+1, min(taken+arr[idx], pref[idx]-taken), n, k, arr);
    ll c2 = Dfn(idx+1, min(pref[idx]-taken+arr[idx], taken), n, k, arr);

    return dp[idx][taken] = 1+min(c1, c2);
}

ll givemeans(vll &arr, ll n, ll k) {
    f(i, 0, n/2) swap(arr[i], arr[n-i-1]);
    cf(i, 0, n+10) {
        pref[i] = 0;
        cf(j, 0, k+10)  dp[i][j] = -1;
    }
    cf(i, 1, n) pref[i] = pref[i-1] + arr[i-1];
    ll ans = Dfn(0, 0, n, k, arr);
    return ans>1e9?-1:ans;
}
int main() {
    int t;
    cin >> t;
    while (t--) {
        ll n, k;
        cin >> n >> k;
        vll h;
        for (ll i=0; i<n; i++)
            cin >> h[i];
        if (n == 1)
            cout << -1 << endl;
        else {
            sort(h.begin(), h.end());
            cout << givemeans(h, n, k) << endl;
        }
    }
}
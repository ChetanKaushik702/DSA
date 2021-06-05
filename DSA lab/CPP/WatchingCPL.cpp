#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll dp[4020][4020];
ll pref[4020];

ll rec_dp(ll idx, ll taken, ll n, ll k, vector<ll> &arr) {
    if (taken>=k && (pref[idx] >= k+taken)) return 0;
    else if(idx >= n)   return 1e10;
    else if(dp[idx][taken] != -1) return dp[idx][taken];
    
    ll c1 = rec_dp(idx+1, min(taken+arr[idx], pref[idx]-taken), n, k, arr);
    ll c2 = rec_dp(idx+1, min(pref[idx]-taken+arr[idx], taken), n, k, arr);

    return dp[idx][taken] = 1+min(c1, c2);
}
ll give_dp(vector<ll> &arr, ll n, ll k) {
    for (ll i=0; i<n/2; i++)    {
        ll temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }

    for (ll i=0; i<=n; i++) {
        pref[i] = 0;
        for (ll j=0; j<=k; j++)  dp[i][j] = -1;
    }

    for (ll i=1; i<=n; i++) pref[i] = pref[i-1] + arr[i-1];
    ll ans = rec_dp(0, 0, n, k, arr);
    return ans>1e9?-1:ans;
}
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--) {
        ll n, k;
        cin >> n >> k;
        vector<ll> h;
        ll sum = 0;
        for (ll i=0; i<n; i++) {
            ll v;
            cin >> v;
            h.push_back(v);
            sum += h[i];
        }
        if (n == 1 || sum < (k << 1)) cout << -1 << "\n";
        else {
            sort(h.begin(), h.end(), greater<int>());
            // for (ll i=0; i<n; i++)  cout << h[i];
            cout << give_dp(h, n, k) <<'\n';
        }
    }
}
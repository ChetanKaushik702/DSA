#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--) {
        int n, k;
        cin >> n >> k;
        if (n == k) {
            for (int i=1; i<=n; i++)    cout << i << " ";
        }else if (k == 1) {
            cout << 1 << " ";
            for (int i=2; i<=n; i++)    cout << -i << " ";
        }else {
            int a[n];
            int neg = n-k;
            for (int i=0; i<n; i++) {
                if (i%2 == 1 && neg > 0) {
                    a[i] = -(i+1);
                    neg--;
                }else {
                    a[i] = i+1;
                }
            }
            if (neg > 0) {
                int i;
                if (n%2 == 1)
                    i = n-1;
                else
                    i = n-2;
                while (neg > 0 && i >= 0) {
                    a[i] = -a[i];
                    neg--;
                    i -= 2;
                }
            }
            for (int i=0; i<n; i++)     cout << a[i] << " "; 
        }
        cout << "\n";
    }
}
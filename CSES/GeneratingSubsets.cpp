#include <bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define pb push_back
vi s;
void subset(int k, int n) {
    if (k == n+1) {
        //process subset
        for (int i=0; i<s.size(); i++)
            cout << s[i] << " ";
        cout << "\n";
    }else {
        s.pb(k);
        subset(k+1, n);
        s.pop_back();
        subset(k+1, n);
    }
}

int main() {
    int a[] = {1, 2, 3, 4, 5};
    cout << "All subsets are:" << endl;
    subset(1, sizeof(a)/sizeof(int));
}
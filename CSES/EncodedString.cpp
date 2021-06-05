#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    map<string, char> mp;
    mp.insert(pair<string, char>("0000", 'a')); mp.insert(pair<string, char>("0001", 'b')); mp.insert(pair<string, char>("0010", 'c')); mp.insert(pair<string, char>("0011", 'd'));
    mp.insert(pair<string, char>("0100", 'e')); mp.insert(pair<string, char>("0101", 'f')); mp.insert(pair<string, char>("0110", 'g')); mp.insert(pair<string, char>("0111", 'h'));
    mp.insert(pair<string, char>("1000", 'i')); mp.insert(pair<string, char>("1001", 'j')); mp.insert(pair<string, char>("1010", 'k')); mp.insert(pair<string, char>("1011", 'l'));
    mp.insert(pair<string, char>("1100", 'm')); mp.insert(pair<string, char>("1101", 'n')); mp.insert(pair<string, char>("1110", 'o')); mp.insert(pair<string, char>("1111", 'p'));

    while (t--) {
        int n;
        string s;
        cin >> n >> s;
        string ans="";
        int i=0;
        while (i < n) {
            ans = ans + mp.find(string(s, i, 4))->second;
            i+=4;
        }
        cout << ans << '\n';
    }
}
#include <bits/stdc++.h>
using namespace std;
#define pb push_back

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    cin >> s;
    map<char, int> mp;
    for (int i=0; i<s.size(); i++) 
        mp[s[i]]++;
    
    int f_odd = 0; 
    for(auto itr=mp.begin(); itr!=mp.end(); itr++) 
            if (itr->second%2 == 1) 
                f_odd++;
            
    if (s.size()%2 == 0) {
        if (f_odd == 0) {
            vector<char> s1;
            for (auto itr=mp.begin(); itr!=mp.end(); itr++) {
                int c = itr->second/2;
                while(c--)
                    s1.pb(itr->first);
            }
            for (int i=0; i<s1.size(); i++)
                cout << s1[i];

            for (int i=s1.size()-1; i>=0; i--)
                cout << s1[i];
        }else {
            cout << "NO SOLUTION" << "\n";
        }
    }else {
        if (f_odd > 1)  cout << "NO SOLUTION" << "\n";
        else {
            vector<char> s1;
            char odd_char;
            for(auto itr=mp.begin(); itr!=mp.end(); itr++) {
                if (itr->second%2 == 1)
                    odd_char = itr->first;
                int f = itr->second/2;
                while(f--)
                    s1.pb(itr->first);
            }
            for (int i=0; i<s1.size(); i++)
                cout << s1[i];
            cout << odd_char;
            for (int i=s1.size()-1; i>=0; i--)
                cout << s1[i];
        }
    }
}
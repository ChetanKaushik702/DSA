#include <iostream>
using namespace std;

int main() {
    char txt[11], pat[5];

    cout << "Enter a text string of length 10: " ;
    for (int i=0; i<10; i++)
        cin >> txt[i];
    txt[10] = '\0';

    cout << "Enter a pattern string of length 4: ";
    for (int i=0; i<4; i++)
        cin >> pat[i];
    pat[4] = '\0';

    // Brute-force approach (O(n^2) time complexity)
    int count=0;
    for (int i=0; i<10; i++) {
        int j=0;
        if (txt[i] == pat[j]) {
            int flag = 1;
            j++;
            if (j < 4)
                for (int k=i+1; k<10; k++) {
                    if (txt[k] != pat[j]) {
                        flag = 0;
                        break;
                    }
                    j++;
                    if (j == 4 && flag == 1) {
                        cout << "Found at index: " << i << endl;
                        count++;
                    }else if (j == 4) {
                        break;
                    } 
                } 
        }
    }
    cout << "Total occurances are: " << count << endl;

    return 0;
}
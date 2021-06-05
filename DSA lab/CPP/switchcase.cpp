#include <iostream>
using namespace std;

int main() {
    int a=65;

    switch(a) {
        case 65:
        case 97: {
            int in;
            cin >> in;
            cout << "You entered: " << char(in);
            switch(in) {
                case 65:
                    cout << " which is a vowel" << endl;
                    break;
            }
            cout << "Vowel" << endl;
            cout << "Not a consonant" << endl;
            break;
        }
        default:
            cout << "You entered wrong value" << endl;
    }
}
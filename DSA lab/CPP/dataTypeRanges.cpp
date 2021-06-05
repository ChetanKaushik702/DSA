#include <iostream>

int main () {
    std::cout << "Size of short signed int: " << sizeof(short int) << "bytes.";
    std::cout << "\nSize of unsigned short int: " << sizeof(unsigned short int) << "bytes.";
    std::cout << "\nSize of signed int: " << sizeof(int) << "bytes.";
    std::cout << "\nSize of unsigned int: " << sizeof(unsigned int) << "bytes.";
    std::cout << "\nSize of float: " << sizeof(float) << "bytes.";
    std::cout << "\nSize of double: " << sizeof(double) << "bytes.";
    std::cout << "\nSize of signed long: " << sizeof(long) << "bytes.";
    std::cout << "\nSize of unsigned long: " << sizeof(unsigned long) << "bytes.";
    std::cout << "\nSize of long long int: " << sizeof(long long int) << "bytes.";
    std::cout << "\nSize of unsigned long long int: " << sizeof(unsigned long long int) << "bytes.";
    std::cout << "\nSize of char: " << sizeof(char) << "bytes.";
    std::cout << "\nSize of unsigned char: " << sizeof(unsigned char) << "bytes.";
    std::cout << "\nSize of wide character: " << sizeof(wchar_t) << "bytes.";
    std::cout << "\nSize of boolean type: " << sizeof(bool) << "bytes.";
    std::cout << "\nSize of long double: " << sizeof(long double) << "bytes.";
    std::cout << "\nSize of boolean type: " << sizeof(bool) << "byte(s).";
    return 0;
}
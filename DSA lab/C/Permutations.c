#include <stdio.h>

int main() {
    long long n;
    scanf("%lld", &n);
    if (n == 1) printf("1");
    else if (n == 2 || n == 3)  printf("NO SOLUTION");
    else {
        for (long long i=2; i<=n; i+=2)   print("%lld ", i);
        for (long long i=1; i<=n; i+=2)   print("%lld ", i);
    }
}
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char * revstr(char s[]);
void recurRevstr(char *s);
void recurRevstr(char *s) {
    if (*s == 0)
        return;
    else {
        // s = s+1;
        // printf("%c", *s);
        recurRevstr(s+1);
        printf("%c", *s);
    }
    
}
char * revstr(char s[]) {
    char *rev = (char *)malloc(sizeof(strlen(s)+1));
    rev[strlen(s)] = 0;
    int i=0;
    while (s[i] != '\0') {  rev[strlen(s)-i-1] = s[i];  i++;  }
    
    return rev;
}

void main() {
    char str[] = "I am a string";
    // printf("%s", c);
    // c[0] = 'i';
    // printf("\n%s\n", c);
    // char *p = NULL;
    // p = c;
    // while (*p != '\0') {
    //     printf("%c", *p);
    //     p++;
    // }
    // char revStr[strlen(str)+1];
    // revStr[strlen(str)] = '\0';
    // int i=0;
    // while (str[i] != '\0') {
    //     revStr[strlen(str)-i-1] = str[i];
    //     i++;
    // }
    // printf("%s ", str);
    // printf("%s\n", revStr);
    // char *rev =  revstr(str);
    // i = 0;
    // while(rev[i] != 0) {
    //     printf("%c", rev[i]);
    //     i++;
    // }
    // recurRevstr(str);
    char c = '+';
    int a=10, b=5;
    int res = a c b;
    printf("%d", res);
}
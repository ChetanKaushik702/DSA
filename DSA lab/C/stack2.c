#include <stdio.h>

char push(char stack[], int *tos, char value, int n) {
    if (*tos == n-1) {
        printf("Stack Overflow.\n");
        return 0;
    }
    *tos = *tos + 1;
    stack[*tos] = value;
    return stack[*tos];
}

char pop(char stack[], int *tos) {
    if (*tos == -1) {
        printf("Stack Underflow.\n");
        return '\0';
    }
    int value = stack[*tos];
    *tos = *tos - 1;
    return value;
}

char peep(char stack[], int *tos) {
    if (*tos == -1)
        return '\0';
    else
        return stack[*tos];
}

int isEmpty(int *tos) {
    return (*tos == -1) ? 1 : 0;
}
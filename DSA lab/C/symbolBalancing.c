#include <stdio.h>
#define N 80

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

void main() {
    char symbol[N];
    printf("Enter the symbols: ");
    scanf("%s", &symbol);
    
    char stack[sizeof(symbol)/sizeof(char)];
    int tos = -1;
    int i=0;
    int flag = 1;
    while (i < sizeof(symbol)/sizeof(char)) {
        char c = symbol[i];
        if (isEmpty(&tos)) {
            if (c == ')') {
                flag = 0;
                break;
            }
            else if (c == '(') 
                push(stack, &tos, c, sizeof(symbol)/sizeof(char));
        }else
        {
            if (c == ')') {
                pop(stack, &tos);
            }
            else if (c == '(')
                push(stack, &tos, c, sizeof(symbol)/sizeof(char));
        }
        i++;
    }
    if (isEmpty(&tos) && flag == 1)
        printf("Balanced symbols.\n");
    else
        printf("Unbalanced symbols.\n");

}
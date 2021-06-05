#include <stdio.h>
#include <string.h>
#define N 80

int push(int stack[], int *tos, int value, int n) {
    if (*tos == n-1) {
        printf("Stack Overflow.\n");
        return 0;
    }
    *tos = *tos + 1;
    stack[*tos] = value;
    return stack[*tos];
}

int pop(int stack[], int *tos) {
    if (*tos == -1) {
        printf("Stack Underflow.\n");
        return 0;
    }
    int value = stack[*tos];
    *tos = *tos - 1;
    return value;
}

int peep(int stack[], int *tos) {
    if (*tos == -1)
        return 0;
    else
        return stack[*tos];
}

int isEmpty(int *tos) {
    return (*tos == -1) ? 1 : 0;
}

void main() {
    char pfix[N];
    // printf("Enter the size of the postfix expression: ");
    // scanf("%d", &len);
    printf("Enter the postfix expression: ");
    scanf("%s", &pfix);
    int len;
    len = strlen(pfix);
    int stk[len];
    int tos = -1;

    int i=0;
    while (i < len) {
        char c = pfix[i];
        if (c >= '0' && c <= '9') {
            int v = c-48;
            // printf("%d", c-48);
            push(stk, &tos, v, len);
        }
        else if (c == '+' || c == '-' || c == '*' || c == '/') {
            int op1 = pop(stk, &tos);
            // printf("\nnt: %d", op1);
            int op2 = pop(stk, &tos);
            // printf("\nnt: %d", op2);
            int res;
            switch(c) {
                case '+':
                    res = (op2 + op1);
                break;
                case '-':
                    res = (op2 - op1);
                break;
                case '/':
                    res = (op2 / op1);
                break;
                case '*':
                    res = (op2 * op1);
                break;
            }
            // printf("%d", res);
            push(stk, &tos, res, len);
        }
        i++;
    }
    printf("%d", pop(stk, &tos));
}
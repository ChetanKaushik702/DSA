#include <stdio.h>
#include <conio.h>

char push(char stack[], int *tos, char value, int n);
char pop(char stack[], int *tos);
char peep(char stack[], int *tos);
int isEmpty(int *tos);
int getPriority(char op);
int isOperand(char c);

int getPriority(char op) {
    if (op == '*' || op == '/')
        return 2;
    else if (op == '+' || op == '-')
        return 1;
    else if (op == '^')
        return 3;
    else
        return 0;
}
int isOperand(char c) {
    return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) ? 1 : 0;
}
void main() {
    char exp[21];
    char pfix[21];
    int len;
    printf("Enter the length of the infix expression: ");
    scanf("%d", &len);
    if (len < 21) {
        printf("Enter the infix expression: ");
        for (int i=0; i<len; i++)
            scanf("%c", &exp[i]);
    } else {
        printf("Error!! Ran out of space.");
    }
    printf("Infix Expression: ");
    for (int i=0; i<len; i++)
        printf("%c", exp[i]);
    printf("\n");
    // creating a stack
    char stack[21];
    int tos = -1;
    // scanning the infix expression character-by-character
    int j=0;
    int i=0;
    while (j < len) {
        char c = exp[j];
        if (isOperand(c)) {
            // add it to the postfix exp directly
            //printf("%c", c);
            pfix[i] = c;
            i++;
        }else if (c == ')') {
            while (1) {
                char popVal = peep(stack, &tos);
                if (popVal == '(') {
                    pop(stack, &tos);
                    break;
                }else {
                    pfix[i] = pop(stack, &tos);
                    //printf("%c", c);
                    i++;
                }
            } 
        }else {
            if (isEmpty(&tos)) 
                push(stack, &tos, c, 21);
            else if (c == '(')
                push(stack, &tos, c, 21);
            else if (c == '+' || c == '-' || c == '^' || c == '/' || c == '*'){
                int prty = getPriority(c);
                while (1) {
                    if (isEmpty(&tos))
                        break;

                    int prtyStack = getPriority(peep(stack, &tos));
                    if (prty > prtyStack) {
                        push(stack, &tos, c, 21);
                        break;
                    }
                    else
                    {
                        //printf("%c", c);
                        pfix[i] = pop(stack, &tos);
                        i++;
                    }
                } 
            }else
            {
                push(stack, &tos, c, 21);
            }
            
        }
        j++;
    }
    while (!isEmpty(&tos)) {
        if (peep(stack, &tos) != '(') {
            pfix[i] = pop(stack, &tos);
            //printf("%c", pfix[i]);
            i++;
        }
    } 

    printf("\nPostfix expression: ");
    for (int j=0; j<i; j++)
        printf("%c", pfix[j]);
    
    getch();
}
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
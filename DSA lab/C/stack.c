#include <stdio.h>


// char push(int stack[], int *tos, int value, int n);
// char pop(int stack[], int *tos);
// int isEmpty(int *tos);

// int main() {
//     int n = 5;
//     int stack[n];
//     int tos = -1;
//     int choice;
//     do {
//         printf("Enter 1 for push.\n");
//         printf("Enter 2 for pop\n");
//         printf("Enter -1 to stop\n");
//         scanf("%d", &choice);

//         switch(choice) {
//             case 1:
//                 if(tos == n-1)
//                     printf("Stack overflow.\n");
//                 else {
//                     int value;
//                     printf("Enter a value to push it onto the stack: ");
//                     scanf("%d", &value);
//                     push(stack, &tos, value, n);
//                 }
//                 break;
//             case 2:
//                 if(tos == -1)
//                     printf("Stack underflow.\n");
//                 else {
//                     int val = pop(stack, &tos);
//                     printf("Value popped out: %d\n", val);
//                 }
//                 break;
//         }
//         printf("\n");
//     } while(choice != -1);

// }
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
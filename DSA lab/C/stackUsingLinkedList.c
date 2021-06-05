#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

//creating a structure for creating a stack
struct stack {
    int data;
    struct stack* next;
};

//function prototype
struct stack* createStack();
void push(struct stack** head, int data);
int pop(struct stack** head);

//function for creating stack
struct stack* createStack() {
    struct stack* temp = (struct stack*)malloc(sizeof(struct stack));
    if (temp == NULL)
        printf("Memory not allocated successfully\n");
    else {
        temp = NULL;
        return temp;
    }
}

//push functionality
void push(struct stack** head, int data) {
    //creating a stack
    struct stack* stack = (struct stack*)malloc(sizeof(struct stack));
 stack->data = data;
 stack->next = NULL;
    if ((*head) == NULL) {
        *head = stack;
    }else {
     stack->next = *head;
        *head = stack;
    }
}

//pop functionality
int pop(struct stack** head) {
    //underflow condition
    if (*head == NULL) {
        printf("Stack Underflow\n");
        return INT_MIN;
    }
    int data = (*head)->data;
    *head = (*head)->next;
    return data;
}

//element at the top of the stack
int tos(struct stack** head) {
    if (*head == NULL) {
        printf("Stack Underflow\n");
        return INT_MIN;
    }
    return (*head)->data;
}

//driver method
void main() {
    int choice, flag = 0;
    struct stack* S = NULL;

    do {
        printf("Enter 1 to create a stack\n");
        printf("Enter 2 to add an element onto the top of stack\n");
        printf("Enter 3 to pop out the element at the top of the stack\n");
        printf("Enter 4 to get the element at the top of the stack\n");
        printf("Enter 0 to exit\n");
        scanf("%d", &choice);

        switch(choice) {
            case 1: {
                S = createStack();
                flag = 1;
                break;
            }
            case 2: {
                if (flag == 0) {
                    printf("ERROR!! Create stack first\n");
                }else {
                    int data;
                    printf("Enter data: ");
                    scanf("%d", &data);
                    push(&S, data);
                }
                break;
            }
            case 3: {
                if (flag == 0) {
                    printf("ERROR!! Create stack first\n");
                }else {
                    int value = pop(&S);
                    if (value != INT_MIN)
                        printf("%d\n", value);
                }
                break;
            }
            case 4: {
                if (flag == 0) {
                    printf("ERROR!! Create stack first\n");
                }else {
                    int value = tos(&S);
                    if(value != INT_MIN)
                        printf("%d\n", value);
                }
                break;
            }
        }
    }while(choice);
}
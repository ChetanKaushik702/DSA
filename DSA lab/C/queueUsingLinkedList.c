#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

struct Q{
    int data;
    struct Q* next;
};

//function prototypes
struct Q* createQ();
void nQ(int);
int dQ();

// queue specific variables
struct Q* front=NULL;
struct Q* rear=NULL;

struct Q* createQ() {
    struct Q* node = (struct Q*)malloc(sizeof(struct Q));
    if (node == NULL) 
        printf("Memory not allocated successfully\n");
    else 
        node = NULL;
    return node;
}

void nQ(int data) {
    struct Q* node = (struct Q*)malloc(sizeof(struct Q));
    node->next = NULL;
    node->data = data;
    if (front == NULL)
        front = rear = node;
    else {
        rear->next = node;
        rear = rear->next;
    }
}

int dQ() {
    // underflow condition
    if (front == NULL) {
        printf("Queue underflow\n");
        return INT_MIN;
    }
    int data = front->data;
    if (front == rear)
        front = rear = NULL;
    else
        front = front->next;
    return data;
}

//driver method
void main() {
    int choice, flag = 0;
    struct Q* S = NULL;

    do {
        printf("Enter 1 to create a queue\n");
        printf("Enter 2 to enque\n");
        printf("Enter 3 to deque\n");
        printf("Enter 0 to exit\n");
        scanf("%d", &choice);

        switch(choice) {
            case 1: {
                S = createQ();
                flag = 1;
                break;
            }
            case 2: {
                if (flag == 0) {
                    printf("ERROR!! Create queue first\n");
                }else {
                    int data;
                    printf("Enter data: ");
                    scanf("%d", &data);
                    nQ(data);
                }
                break;
            }
            case 3: {
                if (flag == 0) {
                    printf("ERROR!! Create queue first\n");
                }else {
                    int value = dQ();
                    if (value != INT_MIN)
                        printf("%d\n", value);
                }
                break;
            }
        }
    }while(choice);
}
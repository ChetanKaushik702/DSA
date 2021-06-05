#include <stdio.h>
#include <conio.h>
#include <limits.h>

void enQueue(int [], int *, int , int );
int deQueue(int [], int *, int *);
void main() {
    int size = 6;
    int Q[size];
    int front = -1, rear = -1;
    int choice;
    do {
        printf("Enter 1 for enqueue\nEnter 2 for dequeue\nEnter 0 to exit\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int value;
                printf("Enter value: ");
                scanf("%d", &value);
                enQueue(Q, &rear, value, size);
                break;
            }

            case 2: {
                deQueue(Q, &rear, &front);
                break;
            }
        }
    }while(choice);
    getch();
}

void enQueue(int Q[], int *rear, int value, int size) {
    if (*rear == size-1) {
        printf("Queue is already full\n");
        return;
    }
    *rear = *rear + 1;
    Q[*rear] = value;
    printf("%d enqueued to linear queue\n", Q[*rear]);
}

int deQueue(int Q[], int *rear, int *front) {
    if (*rear == *front) {
        printf("Queue is empty\n");
        return INT_MIN;
    }
    *front = *front + 1;
    printf("%d dequeued from the queue\n", Q[*front]);
    return Q[*front];
}
#include <stdio.h>
#include <limits.h>

void enQueue (int [], int *, int *, int, int );
int deQueue (int [], int *, int *, int );

void main() {
    int size = 4;
    int Q[size];
    int front = -1, rear = -1, choice;

    do {
        printf("Enter 1 for enQueue\nEnter 2 for deQueue\nEnter 0 to exit\n");
        scanf("%d", &choice);

        switch(choice) {
            case 1: {
                int data;
                printf("Enter data: ");
                scanf("%d", &data);
                enQueue(Q, &rear, &front, data, size);
                break;
            }
            case 2: {
                int val = deQueue(Q, &rear, &front, size);
                if (val != INT_MIN)
                    printf("%d deQueued from queue\n", val);
                break;
            }
        }
        printf("\n");
    }while (choice);
}

void enQueue (int Q[], int *rear, int *front, int value, int size) {
    // overflow condition
    if ((*rear + 1) % size == *front)
        printf("Overflow\n");
    else {
        *rear = (*rear + 1) % size;
        Q[*rear] = value;
        if (*front == -1)
            *front = *rear;
        printf("%d enQueued to queue\n", Q[*rear]); 
    }
}

int deQueue (int Q[], int *rear, int *front, int size) {
    // underflow condition
    if (*front == -1) {
        printf("Underflow\n");
        return INT_MIN;
    }else {
        int data = Q[*front];
        if (*front == *rear)
            *front = *rear = -1;
        else
            *front = (*front + 1) % size;
        return data;
    }
}
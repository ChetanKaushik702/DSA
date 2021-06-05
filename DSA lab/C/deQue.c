#include <stdio.h>
#include <conio.h>
#include <limits.h>
#define N 5
int front = -1, rear = -1;
int dQ[N];

void display();
void insertFront(int);
void insertRear(int);
int deleteFront();
int deleteRear();

void main() {
    int choice;
    do {
        printf("1 for insertFront\n2 for insertRear\n3 for deleteFront\n4 for deleteRear\n5 for display\n0 for exit\n");
        scanf("%d", &choice);

        switch (choice) 
        {
        case 1: {
            int data;
            printf("Enter data: ");
            scanf("%d", &data);
            insertFront(data);
            break;
        }
        case 2: {
            int data;
            printf("Enter data: ");
            scanf("%d", &data);
            insertRear(data);
            break;
        }
        case 3: {
            int data = deleteFront();
            if (data != INT_MIN)
                printf("%d dequeued from front of the deque\n", data);
            break;
        }
        case 4: {
            int data = deleteRear();
            if (data != INT_MIN)
                printf("%d dequeued from rear of the deque\n", data);
            break;
        }
        case 5: {
            printf("Current status: ");
            display();
            break;
        }
        }
        printf("\n");
    } while(choice);
    getch();
}
void display() {
    // underflow condition
    if (front == -1 && rear == -1) 
        printf("Underflow\n");
    else {
        int i = front;
        while (i != rear) {
            printf("%d ", dQ[i]);
            i = (i+1) % N;
        } 
        printf("%d\n", dQ[i]);
    }
}
void insertFront(int value) {
    // overflow condition
    if (front == (rear+1)%N)    // front == rear + 1 || (front == 0 && rear == N-1)
        printf("Overflow\n");
    else {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            dQ[front] = value;
        }
        else if(front == 0) {
            front = N-1;
            dQ[front] = value;
        }
        else {
            front--;
            dQ[front] = value;
        }
    }
}

void insertRear(int value) {
    // overflow condition
    if (front == (rear+1)%N)
        printf("Overflow\n");
    else {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            dQ[rear] = value;
        }
        else if(rear == N-1) {
            rear = 0;
            dQ[rear] = value;
        }
        else {
            rear++;
            dQ[rear] = value;
        }
    }
}

int deleteFront() {
    // underflow condition
    if (front == -1 && rear == -1) {
        printf("Underlow\n");
        return INT_MIN;
    }
    else {
        int val;
        if (front == rear) {
            val = dQ[front];
            front = rear = -1;
        }
        else if (front == N-1) {
            val = dQ[front];
            front = 0;
        }
        else {
            val = dQ[front];
            front++;
        }

        return val;
    }
}

int deleteRear() {
    // underflow condition
    if (front == -1 && rear == -1) {
        printf("Underflow\n");
        return INT_MIN;
    }
    else {
        int val;
        if (rear == front) {
            val = dQ[rear];
            front = rear = -1;
        }
        else if (rear == 0) {
            val = dQ[rear];
            rear = N-1;
        }
        else {
            val = dQ[rear];
            rear--;
        }

        return val;
    }
}
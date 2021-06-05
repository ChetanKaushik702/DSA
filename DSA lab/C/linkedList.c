#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

void traversal(struct Node** head);
void addNode(struct Node** head, int data);
void deleteNode(struct Node** head);

void traversal(struct Node** head) {
    struct Node* temp = *head;
    while(temp) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
}

void addNode(struct Node** head, int data) {
    struct Node* toAdd = (struct Node*)malloc(sizeof(struct Node));
    if (toAdd == NULL) {
        printf("Memory not allocated\n");
        return;
    }else {
        toAdd->data = data;
        toAdd->next = NULL;
        if (*head == NULL) {
            *head = toAdd;
            return;
        }
        struct Node* temp = *head;
        while(temp->next) 
            temp = temp->next;
        temp->next = toAdd;
    }
}

void deleteNode(struct Node** head) {
    if (*head == NULL) {
        printf("Linked-list is empty\n");
    }else {
        if ((*head)->next == NULL) {
            *head = NULL;
        }else {
            struct Node* prev=NULL;
            struct Node* temp=*head;
            while(temp->next) {
                prev = temp;
                temp = temp->next;
            }
            prev->next = NULL;
        }
    }
}

void main() {
    struct Node* head = (struct Node*)malloc(sizeof(struct Node));
    if (head == NULL) {
        printf("Memory not allocated\n");
        exit(0);
    }else {
        int data;
        printf("Enter head node data: ");
        scanf("%d", &data);
        head->next = NULL;
        head->data = data;
    }
    int choice;

    do {
        printf("Enter 1 for adding a node\n");  
        printf("Enter 2 for deleting a node from the end\n");
        printf("Enter 3 for traversal\n");
        printf("Enter 0 for exit\n");
        scanf("%d", &choice);

        switch(choice) {
            case 1: {
                int data;
                printf("Enter node data: ");
                scanf("%d", &data);
                addNode(&head, data);
                break;
            }
            case 2: {
                deleteNode(&head);
                break;
            }
            case 3: {
                traversal(&head);
                break;
            }
        }
        puts("");
    }while(choice);
}
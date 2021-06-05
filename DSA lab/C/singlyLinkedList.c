#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* createNode();
void addNode(struct Node *head, int data);
void insert(struct Node* head, int data, int index);
void delNode(struct Node *head, int pos);
void printContents(struct Node* head);

struct Node* createNode() {
    struct Node *head = (struct Node*)malloc(sizeof(struct Node));
    if (head == NULL) 
        return NULL;
    else 
        return head;
}

void main() {
    //creating the linked-list
    struct Node* head = createNode();
    #ifndef M
    if (head == NULL)
        printf("Memory not allocated\n");
    else {
        int data;
        printf("Enter head data: ");
        scanf("%d",&data);
        head->data = data;
        head->next = NULL;
        int choice;
        do {
            printf("Enter 1 to add a node at the last of the linked-list\n");
            printf("Enter 2 to add a node at a specific index(1-based indexing) in the linked-list\n");
            printf("Enter 3 to delete a node at a specific index(1-based indexing) from the linked-list\n");
            printf("Enter 4 to delete the head element of the linked-list\n");
            printf("Enter 5 to view the contents of the linked-list\n");
            printf("Enter 0 to exit\n");
            
            scanf("%d", &choice);

            switch(choice) {
                case 1: {
                    int data;
                    printf("Enter the data: ");
                    scanf("%d", &data);
                    addNode(head, data);
                    break;
                }
                case 2: {
                    int data, index;
                    printf("Enter the data: ");
                    scanf("%d", &data);
                    printf("Enter the index: ");
                    scanf("%d", &index);
                    if (index == 1) {
                        struct Node* node = createNode();
                        node->data = data;
                        node->next = head->next;
                        head->next = node;
                    }
                    insert(head, data, index);
                    break;
                }
                case 3: {
                    int index;
                    printf("Enter the index: ");
                    scanf("%d", &index);
                    if (index == 1)
                        head = head->next;
                    else
                        delNode(head, index);
                    break;
                }
                case 4: {
                    head = head->next;
                    break;
                }
                case 5: {
                    printContents(head);
                    break;
                }
            }
            printf("\n");
        }while(choice); 
    }
    #endif
    // head->data = 1;
    // head->next = NULL;
    // struct Node * temp = createLinkedList();
    // temp->data = 2;
    // temp->next = NULL;
    // head->next = temp;
    // // head = temp;

    // // struct Node* node = head;
    // // while (node) {
    // //     printf("%d ", node->data);
    // //     node = node->next;
    // // }
    // printContents(head);
    // // delHead(head);
    // // printContents(head);
    // head = head->next;
    // printContents(head);
}

void addNode(struct Node *head, int data) {
    // creating node
    struct Node* toAdd = (struct Node*)malloc(sizeof(struct Node));
    toAdd->data = data;
    toAdd->next = NULL;
    if (head == NULL) {
        head = toAdd;
    }else {
        struct Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        } 
        temp->next = toAdd;
    }
}

void insert(struct Node* head, int data, int index) {
    if (!head) {
        head->data = data;
        head->next = NULL;
        return;
    }
    struct Node* toAdd = (struct Node*)malloc(sizeof(struct Node));
    toAdd->data = data;
    toAdd->next = NULL;
    struct Node* temp = head, *prev=head;
    for (int i=1; i<index-1 && temp->next != NULL; i++) {
        temp = temp->next;
    }
    prev = temp->next;
    temp->next = toAdd;
    toAdd->next = prev;
}

void delNode(struct Node *head, int pos) {
    if (!head)
        return;
    struct Node* temp = head, *prev = head;
    for (int i=1; i<pos; i++) {
        prev = temp;
        if (!temp->next)
            break;
        temp = temp->next;
    }
    prev->next = temp->next;
}


void printContents(struct Node* head) {
    while(head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    puts("");
}
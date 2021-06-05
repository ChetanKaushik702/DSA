#include <stdio.h>
#include <stdlib.h>

struct dLL {
    int data;
    struct dLL *prev;
    struct dLL *next;
};

//function prototypes
struct dLL* createDll();
void addHead(struct dLL** start, int data);
void addTail(struct dLL **start, int data);
void addNode(struct dLL **start, int data, int index);
void traversal(struct dLL *start);
void delNode(struct dLL **start, int index);
// creation of doubly linked-list
struct dLL* createDll() {
    struct dLL* node = (struct dLL*)malloc(sizeof(struct dLL));
    if (node == NULL) {
        printf("Memory not allocated successfully\n");
        return NULL;
    }
    else {
        node = NULL;
        return node;
    }
}

// adding a head node
void addHead(struct dLL** start, int data) {
    struct dLL *head = (struct dLL*)malloc(sizeof(struct dLL));
    if (head == NULL) 
        printf("Memory not allocated successfully\n");
    else {
        head->data = data;
        head->prev = NULL;
        head->next = NULL;
        *start = head;
    }
} 

// adding a tail node 
void addTail(struct dLL **start, int data) {
    struct dLL *tail = (struct dLL*)malloc(sizeof(struct dLL));
    if (tail == NULL) 
        printf("Memory not allocated successfully\n");
    else {
        tail->data = data;
        tail->next = NULL;
        tail->prev = NULL;

        if ((*start) == NULL) {
            *start = tail;
            return;
        }

        // traversing till the end node
        struct dLL* temp = (*start);
        while (temp->next != NULL) 
             temp = temp->next;
        temp->next = tail;
        tail->prev = temp;
    }
}

// adding a node at a particular position
void addNode(struct dLL **start, int data, int index) {
    struct dLL *node = (struct dLL*)malloc(sizeof(struct dLL));
    if (node == NULL) 
        printf("Memory not allocated successfully\n");
    else {
        node->data = data;
        node->next = NULL;
        node->prev = NULL;
        
        if ((*start) == NULL) {
            *start = node;
            return;
        }
        
        if (index == 0) {
            node->next = *start;
            (*start)->prev = node;
            *start = node;
            return;
        }
        // traversing to the position node (0-based indexing)
        struct dLL* temp = (*start);
        for (int i=1; i<index && temp->next != NULL; i++)
            temp = temp->next;
        node->next = temp->next;
        node->prev = temp;
        if (temp->next != NULL)
            temp->next->prev = node;
        temp->next = node;
    }
}

// traversal
void traversal(struct dLL *start) {
    while (start != NULL) {
        printf("%d ", start->data);
        start = start->next;
    }
    printf("\n");
}

// deleting a node at a particular index
void delNode(struct dLL **start, int index) {
    if ((*start) == NULL) {
        printf("Linked-list is empty\n");
        return;
    }
    if (index == 0) {
        *start = (*start)->next;
        return;
    }
    struct dLL *temp = (*start), *node = NULL;
    for (int i=1; i<index; i++) {
        if (temp->next != NULL) {
            if (temp->next->next != NULL)
                temp = temp->next;
            else
                break;
        }else {
            break;
        }
    }
    node = temp->next;
    temp->next = node->next;
    if (node->next != NULL) {
        node->next->prev = temp;
         node->next = NULL;
    }
    node->prev = NULL;
    free(node);
}

void main() {

    int choice, flag = 0;
    struct dLL* start;
    do {
        printf("Enter 1 to create a doubly linked-list\n");
        printf("Enter 2 to add a node\n");
        printf("Enter 3 to delete a node\n");
        printf("Enter 4 to traverse\n");
        printf("Enter 0 to exit\n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1: {
            start = createDll();
            flag = 1;
            break;
        }
        case 2: {
            if (flag == 0) {
                printf("Error!! Create a doubly linked-list first...\n");
                break;
            }
            else {
                int option;
                do {
                    printf("Enter 21 to add a head node\n");
                    printf("Enter 22 to add a tail node\n");
                    printf("Enter 23 to add a node at a specific index(0-based indexing)\n");
                    printf("Enter 24 to traverse\n");
                    printf("Enter 20 to exit\n");
                    scanf("%d", &option);

                    switch (option)
                    {
                    case 21: {
                        int data;
                        printf("Enter data: ");
                        scanf("%d", &data);
                        addHead(&start, data);
                        break;
                    }
                    case 22: {
                        int data;
                        printf("Enter data: ");
                        scanf("%d", &data);
                        addTail(&start, data);
                        break;
                    }
                    case 23: {
                        int data, index;
                        printf("Enter data and index(0-based indexing): ");
                        scanf("%d %d", &data, &index);
                        addNode(&start, data, index);
                        break;
                    }
                    case 24: {
                        traversal(start);
                        break;
                    }
                    printf("\n");
                }
            }while(option != 20);
            break;
            }
        }
        case 4: {
            if (flag == 0) {
                printf("Error!! Create a doubly linked-list first...\n");
                break;
            }else {
                traversal(start);
                break;
            }
        }
        case 3: {
            if (flag == 0) {
                printf("Error!! Create a doubly linked-list first...\n");
                break;
            }else {
                int index;
                printf("Enter index(0-based indexing): ");
                scanf("%d", &index);
                delNode(&start, index);
                break;
            }
        } 
        
    }
    printf("\n");
    }while(choice);

}
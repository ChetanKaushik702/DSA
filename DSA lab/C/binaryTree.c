#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct binTree {
    int data;
    struct binTree* left;
    struct binTree* right;
};

//function prototype
struct binTree* newNode(int data);
int search(struct binTree* root, int value);
void inorder(struct binTree* root);
void preorder(struct binTree* root);
void postorder(struct binTree* root);

struct binTree* newNode(int data) {
    struct binTree* node = (struct binTree*)calloc(1, sizeof(struct binTree));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

void inorder(struct binTree* root) {
    if (root) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

void preorder(struct binTree* root) {
    if (root) {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct binTree* root) {
    if (root) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

int search(struct binTree* root, int value) {
    if (root == NULL)
        return 0;
    else if (root->data == value)
        return 1;
    else {
        int res1 = search(root->left, value);
        if (res1)
            return 1;
        int res2 = search(root->right, value);
        return res2;
    }
}

void insert(struct binTree** root, int data) {
    struct binTree* node = newNode(data);
    // empty tree condition
    if ((*root)->data == 0) {
        *root = node;
    }else {
        struct binTree* temp = *root;
        while (1) {
            if (node->data <= temp->data) {
                if (temp->left == NULL) {
                    temp->right = node;
                    break;
                }
                temp = temp->left;
            }else {
                if (temp->right == NULL) {
                    temp->right = node;
                    break;
                }
                temp = temp->right;
            }
        }

    }
}

struct binTree* createTree() {
    struct binTree* root = (struct binTree*)malloc(sizeof(struct binTree));
    return root;
}

void main() {
    int choice;
    int n;
    printf("Enter number of nodes: ");
    scanf("%d", &n);
    struct 
    for (int i=1;i<=n; i++) {

    }
    do {
        printf("Enter 1 to add data:\n");
        printf("Enter 3 for preorder traversal:\n");
        printf("Enter 4 for postorder traversal:\n");
        printf("Enter 5 for inorder traversal:\n");
        printf("Enter 6 for searching:\n");
        printf("Enter 0 to quit\n");
        scanf("%d", &choice);
        switch(choice) {
            case 1: {
                    int data;
                    printf("Enter data: ");
                    scanf("%d", &data);
                    insert(&root, data);
                break;
            }
            // case 2: {
            //     struct binTree* root = (struct binTree*)malloc(sizeof(struct binTree));
            //     while
            // }
            case 3: {
                    preorder(root);
                break;
            }
            case 4: {
                    postorder(root);
                break;
            }
            case 5: {
                    inorder(root);
                break;
            }
            case 6: {
                    int data;
                    printf("Enter data to search:\n");
                    scanf("%d", &data);
                    if (search(root, data)) {
                        printf("%d found\n", data);
                    }else {
                        printf("%d not found\n", data);
                    }
                break;
            }
        }
        printf("\n");
    }while(choice);

    getch(); 
}
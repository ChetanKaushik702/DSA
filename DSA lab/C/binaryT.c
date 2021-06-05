#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct tree {
    int data;
    struct tree* lchild;
    struct tree* rchild;
};

struct tree* createBT() {
    struct tree* root = (struct tree*)calloc(1, sizeof(struct tree));
    if (root == NULL){
        printf("Memory not allocated successfully\n");
        return NULL;
    }
    return root;
}

void insert(struct tree** root, int data) {
    struct tree* node = (struct tree*)calloc(1, sizeof(struct tree));
    node->data = data;
    node->lchild = NULL;
    node->rchild = NULL;
    // empty tree condition
    if ((*root)->data == 0) {
        *root = node;
    }else {
        struct tree* temp = *root;
        while (1) {
            if (node->data <= temp->data) {
                if (temp->lchild == NULL) {
                    temp->lchild = node;
                    break;
                }
                temp = temp->lchild;
            }else {
                if (temp->rchild == NULL) {
                    temp->rchild = node;
                    break;
                }
                temp = temp->rchild;
            }
        }

    }
}

void inorder(struct tree* root) {
    if (root) {
        inorder(root->lchild);
        printf("%d ", root->data);
        inorder(root->rchild);
    }
}

void preorder(struct tree* root) {
    if (root) {
        printf("%d ", root->data);
        preorder(root->lchild);
        preorder(root->rchild);
    }
}

void postorder(struct tree* root) {
    if (root) {
        postorder(root->lchild);
        postorder(root->rchild);
        printf("%d ", root->data);
    }
}

int findMax(struct tree* root) {
    if (root == NULL) {
        printf("EMPTY TREE\n");
        return 0;
    }
    while (root->rchild) 
        root = root->rchild;
    return root->data;
}

int findMin(struct tree* root) {
    if (root == NULL) {
        printf("EMPTY TREE\n");
        return 0;
    }
    while (root->lchild) 
        root = root->lchild;
    return root->data;
}

int search(struct tree* root, int data) {
    if (root == NULL) {
        printf("EMPTY TREE\n");
        return 0;
    }
    int flag = 0;
    while (root) {
        if (root->data == data) {
            flag = 1;
            break;
        }
        else if (data < root->data) {root = root->lchild;}
        else {root = root->rchild;}
    }
    return flag;
} 
void main() {
    struct tree* root = createBT();
    int n;
    printf("Enter n: ");
    scanf("%d", &n);
        int data;
        printf("Enter data: ");
        scanf("%d", &data);
        root->data = data;
        root->lchild = NULL;
        root->rchild = NULL;
        for (int i=2; i<=n; i++) {
        printf("Enter data: ");
        scanf("%d", &data);
        struct tree* node = (struct tree*)calloc(1, sizeof(struct tree));
        node->data = data;
        node->lchild = NULL;
        node->rchild = NULL;
        struct tree* temp = root;
        while (1) {
            if (node->data <= temp->data) {
                if (temp->lchild == NULL) {
                    temp->lchild = node;
                    break;
                }
                temp = temp->lchild;
            }else {
                if (temp->rchild == NULL) {
                    temp->rchild = node;
                    break;
                }
                temp = temp->rchild;
            }
        }
    }
    int choice;
    do {
        printf("Enter 1 for preorder\n");
        printf("Enter 2 for postorder\n");
        printf("Enter 3 for inorder\n");
        printf("Enter 0 to exit\n");

        scanf("%d", &choice);
        switch(choice) {
            case 1:
                preorder(root);
                break;
            case 2:
                preorder(root);
                break;
            case 3:
                preorder(root);
                break;
        }
        printf("\n");
    }while(choice);

    getch();
}
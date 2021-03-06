#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

struct Node {
  int data;
  struct Node* next;
  Node (int x) {
      data = x;
      next = NULL;
  }
};
struct Node* buildList(int size);
void printList(Node *node);
Node* subLinkedList(Node* l1, Node* l2);
Node* reverse(Node *head);
int sizeOfLinkedList(Node *head);
Node* compare(Node *h1, Node *h2);
Node* removeLeadingZeros(Node *head);
Node* mainSubtract(Node *l, Node *s);

struct Node* buildList(int size) {
    int val;
    cin >> val;
    
    Node *head = new Node(val);
    Node *tail = head;
    
    for (int i=1; i<size; i++) {
        cin >> val;
        tail->next = new Node (val);
        tail = tail->next;
    }
    
    return head;
}

void printList(Node *node) {
    while (node) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n;
        Node *first = buildList(n);
        
        cin >> m;
        Node *second = buildList(m);
        
        Node *res =  subLinkedList(first, second);
        printList(res);
    }
    
    return 0;
}

/* Structure of linked list Node

struct Node
{
    int data;
    struct Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
};

*/

//You are required to complete this method

Node* subLinkedList(Node* l1, Node* l2)
{
    //Your code here
    	if (l1 == NULL && l2 == NULL)
            return NULL;
    
        l1 = removeLeadingZeros(l1);
        l2 = removeLeadingZeros(l2);
    
        if (l1 == NULL && l2 == NULL)
        return new Node(0);
    	else if (l1 == NULL)
        	return l2;
    	else {

            int n1 = sizeOfLinkedList(l1);
            int n2 = sizeOfLinkedList(l2);

            if (n1 == n2) {
                Node *greater = compare(l1, l2);
                if (greater == NULL) // identical node;
                    return new Node(0);
                else if (greater == l1) {
                    Node *l = reverse(l1);
                    Node *s = reverse(l2);
                    return mainSubtract(l, s);
                }else {
                    Node *l = reverse(l2);
                    Node *s = reverse(l1);
                    return mainSubtract(l, s);
                }
        	}
            
            l1 = reverse(l1);
            l2 = reverse(l2);
            
            if (n1 > n2) {
                return mainSubtract(l1, l2);
            }else {
                return mainSubtract(l2, l1);
            }
    	}
    
}

// reverse linked-list routine
Node* reverse(Node *head) {
    Node *currNode = NULL;
    Node *nextNode = NULL;
    while (head) {
        nextNode = head->next;
        head->next = currNode;
        currNode = head;
        head = nextNode;
    }
    return currNode;
}

// size of linked-list routine
int sizeOfLinkedList(Node *head) {
    Node *temp = head;
    int size = 0;
    while (temp) {
        size += 1;
        temp = temp->next;
    }
    return size;
}

// compare two linked-list when their sizes are same
Node* compare(Node *h1, Node *h2) {
    Node *t1 = h1, *t2 = h2;
    while (t1 != NULL && t2 != NULL) {
        if (t1->data != t2->data) {
            if (t1->data > t2->data)
                return h1;
            else
                return h2;
        }
        t1 = t1->next;
        t2 = t2->next;
    }
    if (t1 != NULL)
        return h1;
    else if (t2 != NULL)
        return h2;
    else
        return NULL;
}

// remove leading-0s routine
Node* removeLeadingZeros(Node *head) {
    while(head && head->data == 0)
        head = head->next;
    return head;
}

// main subtract routine (assumnes that l is greater node and s is smaller node)
Node* mainSubtract(Node *l, Node *s) {
    Node *head = NULL;
    Node *temp = NULL;
    int b = 0;
    
    while (s) {
        if (l->data + b < s->data) {
            Node *node = new Node(l->data + b + 10 - s->data);
            b = -1;
            if (head == NULL) {
                head = node;
                temp = node;
            }else {
                temp->next = node;
                temp = node;
            }
        }else {
            Node *node = new Node(l->data + b - s->data);
            b = 0;
            if (head == NULL) {
                head = node;
                temp = node;
            }else {
                temp->next = node;
                temp = node;
            }
        }
        l = l->next;
        s = s->next;
    }
    
    while(l) {
        if (l->data + b < 0) {
            Node *node = new Node(l->data + b + 10);
            b = -1;
            temp->next = node;
            temp = node;
        }else {
            Node *node = new Node(l->data + b);
            b = 0;
            temp->next = node;
            temp = node;
        }
        l = l->next;
    }
    
    head = reverse(head);
    head = removeLeadingZeros(head);
    
    return head;
}
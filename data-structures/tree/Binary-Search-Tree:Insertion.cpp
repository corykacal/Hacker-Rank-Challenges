/*
Node is defined as 

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;

*/


node * insert(node * root, int value) {
    if(root==NULL) {
        root = new node();
        root->data = value;
        return root;
    }
    node* cur = root;
    node* prev = NULL;
    while(cur!=NULL) {
        int data = cur->data;
        if(data>value) {
            prev = cur;
            cur = cur->left;
        } else if(data<value) {
            prev = cur;
            cur = cur->right;
        } else {
            break;
        }
    }
    node* newnode = new node();
    newnode->data = value;
    newnode->right = NULL;
    newnode->left = NULL;
    if(prev->left==NULL) {
        prev->left = newnode;
    } else if(prev->right==NULL) {
        prev->right = newnode;
    }
    return root;
}
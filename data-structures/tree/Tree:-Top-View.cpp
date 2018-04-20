/*
struct node
{
    int data;
    node* left;
    node* right;
};

*/

void printLeft(node* root) {
    if(root!=NULL) {
        printLeft(root->left);
        printf("%d ",root->data);
    }
}

void printRight(node* root) {
    if(root!=NULL) {
        printf("%d ",root->data);
        printRight(root->right);
    }
}

void topView(node * root) {
    if(root!=NULL) {
        printLeft(root->left);
        printf("%d ",root->data);
        printRight(root->right);
    }
}
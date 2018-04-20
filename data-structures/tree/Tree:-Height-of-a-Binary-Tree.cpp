
/*The tree node has data, left child and right child 
class Node {
int data;
Node* left;
Node* right;
};

*/
int height(Node* root) {
    if(root!=NULL) {
        int rightHeight = height(root->right)+1;
        int leftHeight = height(root->left)+1;
        return (leftHeight>rightHeight) ? leftHeight : rightHeight;

    }
    return -1;
}

#include <map>
#include <queue>
/*
struct node
{
    int data;
    node* left;
    node* right;
}*/

void levelOrder(node * root) {
    map <int, vector<int>> levels;
    queue<node*> nodes;
    
    int height = 0;
    
    node* cur;
    nodes.push(root);
    
    while(!nodes.empty()) {
        //getting a new node
        cur = nodes.front();
        nodes.pop();
        
        //print the current level data
        printf("%d ",cur->data);
        
        //adding new nodes to queue
        node* right = cur->right;
        node* left = cur->left;
        if(left!=NULL) {
            nodes.push(left);
        }
        if(right!=NULL) {
            nodes.push(right);
        }

    }

}

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
        
        //placing data into the right levels
        int data = cur->data;
        map<int, vector<int>>::iterator cur_level = levels.find(height);
        if(cur_level==levels.end()) {
            vector<int> data_at_level;
            data_at_level.push_back(data);
            levels.insert(pair <int, vector<int>> (height, data_at_level));
        } else {
            cur_level->second.push_back(data);
        }
        
        //updating height
        if(nodes.empty()) {
            height++;
        }
        
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
    
    //printing all levels in order
    for(const auto &p : levels) {
        for(const auto &v : p.second) {
            printf("%d ", v);
        }
    }
}
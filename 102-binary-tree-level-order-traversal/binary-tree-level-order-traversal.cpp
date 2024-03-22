/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
 class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> result;
        if (root == nullptr)
            return result;
        
        queue<TreeNode*> myQueue;
        myQueue.push(root);
        
        while (!myQueue.empty()) {
            int length = myQueue.size();
            vector<int> v;
            
            for (int i = 0; i < length; i++) {
                TreeNode* node = myQueue.front();
                myQueue.pop();
                
                if (node != nullptr) {
                    v.push_back(node->val);
                    if (node->left != nullptr) {
                        myQueue.push(node->left);
                    }
                    if (node->right != nullptr) {
                        myQueue.push(node->right);
                    }
                }
            }
            result.push_back(v);
        }
        return result;
    }
};
/*
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        int length;
        TreeNode* node;
        vector<vector<int>> result;
        queue<TreeNode*> myQueue;
        myQueue.push(root);
        while (!myQueue.empty()) {
            length = myQueue.size();
            vector<int> v;
            for (int i = 0; i < length; i++) {
                node = myQueue.front();
                if (node != NULL) {
                    v.push_back(node -> val);
                    myQueue.push(node -> left);
                    myQueue.push(node -> right);
                }
            }
            result.push_back(v);
        }
        return result;
    }
};*/
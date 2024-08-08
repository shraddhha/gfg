class Solution {
  public:
    int solve(Node *root){
        if(root==NULL) return 0;
        if(root->left==NULL && root->right==NULL) return root->data;
        int leftSum = solve(root->left);
        if(leftSum == -1) return -1;
        int rightSum = solve(root->right);
        if(rightSum == -1) return -1;
        if(leftSum+rightSum != root->data) return -1;
        return root->data + leftSum + rightSum;
        
    }
    bool isSumTree(Node* root) {
        return solve(root) != -1 ? true : false;
    }
};

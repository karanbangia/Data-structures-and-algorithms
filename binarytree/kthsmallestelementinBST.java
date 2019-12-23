/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count =0;
    int temp = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root ==  null){
            return 0;
        }
        
        kthSmallest(root.left,k);
        count++;
        if(count == k){
            temp = root.val;
        }
        kthSmallest(root.right,k);
       
        return temp;
    }
    
}

 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

public class Solution {
    public TreeNode flatten(TreeNode a) {
        if(a==null)return null;
        fun(a);
       return a;
    }
    public void fun(TreeNode a)
    {
        if(a==null)return;
        if(a.left==null && a.right==null)return;
        TreeNode rightchild=a.right;
        a.right=a.left;
        a.left=null;
        fun(a.right);
        while(a.right!=null)
        {a=a.right;}
        a.right=rightchild;
        fun(a.right);
        
       
        
    }
}

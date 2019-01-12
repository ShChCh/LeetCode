/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void iteMerge(TreeNode ret, TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return ;
        if(t1!=null && t2!=null)
            ret.val = t1.val + t2.val;
        else if(t1==null)  {ret.val = t2.val; ret.left = t2.left; ret.right = t2.right; return;}
        else   {ret.val = t1.val; ret.left = t1.left; ret.right = t1.right; return;}
        if(t1.left!=null || t2.left!=null){ret.left = new TreeNode(-1); iteMerge(ret.left, t1.left, t2.left);}
        if(t1.right!=null || t2.right!=null){ret.right = new TreeNode(-1); iteMerge(ret.right, t1.right, t2.right);}
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return null;
        
        TreeNode ret = new TreeNode(-1);
        iteMerge(ret,t1,t2);
        return ret;
        
    }
}
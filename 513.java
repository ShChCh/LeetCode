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
    List<Integer> val = new ArrayList<Integer>();
    List<Integer> depth = new ArrayList<Integer>();
    int max = -1;
    public void f(TreeNode root, int dep){
        if(root.left!=null) f(root.left, dep+1);
        if(root.right!=null) f(root.right, dep+1);
        val.add(root.val);
        depth.add(dep);
        if(max<dep) max = dep;
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        f(root,0);
        for(int i=0; i<depth.size(); i++){
            if(depth.get(i)==max)
                return val.get(i);
        }
        return root.val;
    }
}
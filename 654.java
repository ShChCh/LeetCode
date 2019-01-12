import java.util.ArrayList;
import java.util.List;


 
class Solution {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    	TreeNode root = new TreeNode(nums[0]);
    	root.left = null;
    	root.right = null;
    	for(int i=1; i<nums.length; i++){
			TreeNode newNode = new TreeNode(nums[i]);
			newNode.left = null;
			newNode.right = null;
    		if(nums[i]>root.val){
    			newNode.right = null;
    			newNode.left = root;
    			root = newNode;
    			continue;
    		}
    		TreeNode tmpRoot = root;
    		while(true){
	    		TreeNode tmpNode = tmpRoot.right;
	    		if(tmpNode==null){ tmpRoot.right = newNode; break; }
	    		if(tmpNode.val < newNode.val){
	    			newNode.left = tmpNode;
	    			tmpRoot.right = newNode;
	    			break;
	    		}
	    		tmpRoot = tmpNode;
    		}
    	}
		return root;
        
    }
    public static void main(String[] abc){
    	int[] a = {3,2,1,6,0,5};
    	Solution gg = new Solution();
    	TreeNode root = gg.constructMaximumBinaryTree(a);
    	printNode(root);
    	
    }
    public static void printNode(TreeNode root){
    	List<TreeNode> list = new ArrayList<TreeNode>();
    	list.add(root);
    	while(!list.isEmpty()){
    		TreeNode printNode = list.get(0);
    		if(printNode.left != null)
    			list.add(printNode.left);
    		if(printNode.right != null)
    			list.add(printNode.right);
    		System.out.println("node: " + printNode.val);
    		list.remove(0);
    	}
    	
    }
}
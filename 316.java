class Solution {
	    public String removeDuplicateLetters(String s) {
	    	int[] flags = new int[26];
	    	for(int idx = 0; idx<s.length(); idx++)
	    		flags[s.charAt(idx)-'a'] += 1;
	    	// count all characters;
	    	ArrayList<Integer> stack = new ArrayList<Integer>();
	    	for(int i=0; i<s.length(); i++) {
	    		if(stack.contains(s.charAt(i)-'a')) {
					flags[s.charAt(i)-'a']--;
	    			continue;
	    		}
	    		if(stack.size() == 0) {
	    			stack.add(s.charAt(i)-'a');
	    		}
	    		while(stack.size() > 0 && stack.get(stack.size()-1) > s.charAt(i)-'a' && 
	    				flags[stack.get(stack.size()-1)]>0) {
	    			stack.remove(stack.size()-1);
	    		}
	    		if(!stack.contains(s.charAt(i)-'a')) {
	    			stack.add(s.charAt(i)-'a');
	    		}
				flags[s.charAt(i)-'a']--;
	    	}
	    	String re = "";
	    	for(int i=0; i<stack.size(); i++)
	    		re = re + (char)(stack.get(i)+'a');
	    	return re;
	    }
}
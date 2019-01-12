class Solution {
    public int calPoints(String[] ops) {
        List<Integer> result = new ArrayList<Integer>();
    	for(int i=0; i<ops.length; i++){
    		if(ops[i].equals("+")){
    			result.add(result.get(result.size()-1) + result.get(result.size()-2));
    			continue;
    		}
    		if(i>0 && ops[i].equals("C")){ 
    			result.remove(result.size()-1);
    			continue;
    		}
    		if(ops[i].endsWith("D")){
    			result.add(result.get(result.size()-1)*2);
    			continue;
    		}
    		result.add(Integer.parseInt(ops[i]));
    	}
    	int returnVal = 0;
    	for(int idx = 0 ; idx < result.size(); idx++)
    		returnVal += result.get(idx);
		return returnVal;
    }
}
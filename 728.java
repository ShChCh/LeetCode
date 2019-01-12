class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> returnList = new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
        	String newStr = i + "";
        	boolean addOne = true;
        	for(int j=0; j<newStr.length(); j++){
        		int digit = Integer.parseInt(newStr.charAt(j)+"");
        		if(digit==0 || i % digit !=0){ addOne=false; break;}
        	}
        	if(addOne) returnList.add(i);
        }
		return returnList;
    }
}
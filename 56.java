/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null) return null;
    	List<Interval> re = new ArrayList<Interval>();
        if(intervals.size()==0 ) return re;
    	intervals.sort(new Comparator<Interval>() {
			@Override
			public int compare(Interval arg0, Interval arg1) {
				// TODO Auto-generated method stub
    	        if(arg0.start == arg1.start){
    	            return 0;
    	        }
    	        return arg0.start > arg1.start ? 1 : -1;
			}
    	});
        re.add(new Interval(intervals.get(0).start, intervals.get(0).end) );
    	// sort ?, ???????
    	for(int i=1; i<intervals.size(); i++) {
    		if(re.get(re.size()-1).end >= intervals.get(i).start) {
                int end = re.get(re.size()-1).end > intervals.get(i).end ? re.get(re.size()-1).end : intervals.get(i).end ;
                re.get(re.size()-1).end = end;
    		}
    		else
    			re.add(new Interval(intervals.get(i).start, intervals.get(i).end));
    	}
        return re;
    }
}
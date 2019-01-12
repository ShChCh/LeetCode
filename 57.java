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
	public boolean overlap(Interval i1, Interval i2) {
		int first = i1.start > i2.start ? i1.start : i2.start;
		int last = i1.end < i2.end ? i1.end : i2.end;
		if(first <= last)
			return true;
		else
			return false;
	}
	public Interval mergeInterval(Interval i1, Interval i2) {
		int first = i1.start < i2.start ? i1.start : i2.start;
		int last = i1.end > i2.end ? i1.end : i2.end;
		Interval newInterval = new Interval();
		newInterval.start = first;
		newInterval.end = last;
		return newInterval;
	}
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> re = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0){
            re.add(new Interval(newInterval.start, newInterval.end));
            return re;
        }
        int idx = 0;
        while(idx < intervals.size() && !overlap(intervals.get(idx), newInterval)) {
        	if(intervals.get(idx).start < newInterval.start){
        		re.add(new Interval(intervals.get(idx).start, intervals.get(idx).end));
        	    idx ++;
            }
            else
                break;
        }
        Interval mergedItem = new Interval(newInterval.start, newInterval.end);
        
        while(idx < intervals.size() && overlap(intervals.get(idx), mergedItem)) {
        	mergedItem = mergeInterval(mergedItem, intervals.get(idx));
        	idx ++;
        }
        re.add(new Interval(mergedItem.start, mergedItem.end));
        if(idx < intervals.size() && intervals.get(idx).start > mergedItem.start){
        	re.add(new Interval(intervals.get(idx).start, intervals.get(idx).end));
            idx ++;
        }
        while(idx < intervals.size()) {
        	re.add(new Interval(intervals.get(idx).start, intervals.get(idx).end));
        	idx ++;
        }
        
        return re;
    }
}
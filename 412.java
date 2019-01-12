public class Solution {
    public List<String> fizzBuzz(int n) {
        String[] ret = new String[n];
        for(int i=0; i<n; i++){
            ret[i] = "";
            if((i+1)%3!=0 && (i+1)%5!=0){ ret[i]+=(i+1); continue;}
            if((i+1)%3==0) ret[i] += "Fizz";
            if((i+1)%5==0) ret[i] += "Buzz";
        }
        List<String> retArr = new ArrayList<String>();
        for(int i=0; i<n; i++)
            retArr.add(ret[i]);
        return retArr;
    }
}
// ×Ö·û´®£¬ArrayList£¬Í¬³ý
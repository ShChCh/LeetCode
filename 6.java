public class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) return s;
        StringBuilder[] ret = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++)
            ret[i] = new StringBuilder();
        int model = -1;
        for(int i=0; i<numRows; i++){
            ret[i].append(s.charAt(i));
        }
        if(numRows>2){
            for(int i=numRows; i<s.length(); i++){
                if((i-numRows+1)%(numRows-1)==0) model = model*(-1);
                if(model==1)
                    ret[(i-numRows+1)%(numRows-1)].append(s.charAt(i));
                else
                    ret[numRows-(i-numRows+1)%(numRows-1)-1].append(s.charAt(i));
            }
        }
        else{
            for(int i=numRows; i<s.length(); i++){
                ret[i%2].append(s.charAt(i));
            }
        }
        StringBuilder retStr = new StringBuilder();
        for(int i=0; i<numRows; i++)
            retStr.append(ret[i].toString());
        return retStr.toString();
    }
}
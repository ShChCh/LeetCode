public class Solution {
    public String reverseWords(String s) {
        String[] content = s.split(" ");
        String ret = "";
        boolean first = true;
        for(int i=0; i<content.length; i++){
            String c = content[i];
            String newStr = "";
            for(int j=c.length()-1; j>=0; j--)
                newStr += c.charAt(j);
            if(!first) ret += " ";
            ret += newStr;
            first = false;
        }
        return ret;
    }
}
// 数组用 s.length ， 字符串或object用 o.length()， String 求index处值用 charAt
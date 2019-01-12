public class Solution {
    public String reverseString(String s) {
        StringBuffer result = new StringBuffer();  
        for (int i = s.length() - 1; i >= 0; i--) {  
            result.append(s.charAt(i));  
}       return result.toString();
    }
}
// 字符串 拼接  不同实现  超时   少用加号。
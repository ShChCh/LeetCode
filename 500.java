public class Solution {
    public String[] findWords(String[] words) {
        
        int index[] = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        String[] r = {};
        String ret = "";
        for(int i=0; i<words.length; i++){
            char c1 = words[i].charAt(0);
            if(c1>='a') c1 -= ('a'-'A');
            int ind = index[c1-'A'];
            boolean flag = true;
            for(int j=0; j<words[i].length(); j++){
                char c = words[i].charAt(j);
                if(c>='a') c -= ('a'-'A');
                if(index[c-'A']!=ind){ flag=false; break;}
            }
            if(flag){ if(!ret.equals("")) ret+=" "; ret+=words[i]; }
        }
        if(!ret.equals(""))
            return ret.split(" ");
        else
            return r;
    }
}
// 字符串ASCII码，动态数组，数组声明
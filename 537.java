public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] op1 = a.split("\\+");
        String[] op2 = b.split("\\+");
        int op11 = Integer.parseInt(op1[0]);
        int op21 = Integer.parseInt(op2[0]);
        int op12 = 1;
        int op22 = 1;
        if(op1[1].startsWith("-")){ op12 *= -1; op1[1] = op1[1].substring(1);}
        op12 *= Integer.parseInt(op1[1].substring(0,op1[1].length()-1));
        if(op2[1].startsWith("-")){ op22 *= -1; op2[1] = op2[1].substring(1);}
        op22 *= Integer.parseInt(op2[1].substring(0,op2[1].length()-1));
        
        int ret1 = op11*op21;
        ret1 += op12*op22*(-1);
        int ret2 = op11*op22+op12*op21;
        return ""+ret1+"+"+ret2+"i";
    }
}
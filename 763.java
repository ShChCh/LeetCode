package patternDesign;

import java.util.*;

public class Solution {
	public static List<Integer> partitionLabels(String S) {
        List<Integer> re = new ArrayList<Integer>();
        int[] alphListFirst = new int[26];
        int[] alphListLast = new int[26];
        int[] reached = new int[26];
        for(int i=0; i<26; i++){
        	alphListFirst[i] = -1;
        	alphListLast[i] = -1;
        	reached[i] = 0;
        }
        int color = 0;
        for(int i=0; i<S.length(); i++){
        	int index = S.charAt(i) - 'a';
        	if(alphListFirst[index]==-1){
        		alphListFirst[index] = i;
        		color ++;
        	}
        	alphListLast[index] = i;
        }
        int ptF = 0;
        int ptL = 0;
        // first chararcter
        // merge. 
        while(color>0 && ptF<S.length()){

            for(int i=0; i<26; i++)
            	if(alphListFirst[i]==ptF){
            		ptL = alphListLast[i];
            		reached[i] = 1;
            		color--;
            		break;
            	}
            
	        for(int i=0; i<26; i++)
	        	if(reached[i]==0 && alphListFirst[i]>ptF && alphListFirst[i]<ptL){
	        		reached[i] = 1;
	        		color--;
	        		if(alphListLast[i]>ptL){
	        			ptL = alphListLast[i];
	        			i = 0;
	        		}
				}
	        
	        re.add(ptL-ptF+1);
	        ptF = ptL+1;
        }
        return re;
    }
	public static void main(String[] args){
		List<Integer> re = partitionLabels("ababcbacadefegdehijhklij");
		for(int i=0; i<re.size(); i++)
			System.out.println(re.get(i));
	}
}

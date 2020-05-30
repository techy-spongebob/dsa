package nerd.techy.spongebob.dsa.leetcode.solutions.app;

class LC0007OofMHorizontalScanningSolution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) {
            return "";
        }
        
        int size = strs.length;
        String prefix = strs[0];
        int prefixLength = prefix.length();
        
        for(int i=1; i<size; i++) {
            
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, --prefixLength);
                if(prefixLength == 0) return "";
            }
            
        }
        
        return prefix;
        
    }
}
class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int count = 0;

        for(int i=0; i<s.length()-1;i++) {
            if(s.charAt(i) == '(') 
                    res = Math.max(res, ++count);
            if(s.charAt(i) == ')') count --;
           
        }
        return res;
    }
}
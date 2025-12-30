class Solution {
    public int lengthOfLongestSubstring(String s) {
       String str="";
        int max=0;
        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            while(i<j && str.contains(String.valueOf(ch))){
                str=str.substring(1);
                i++;
            }
            str+=ch;
            max=Math.max(max,str.length());
            j++;
        }
        return max;
    }
}
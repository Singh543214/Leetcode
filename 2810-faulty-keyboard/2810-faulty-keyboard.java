class Solution {
    public String finalString(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if(ch!='i') str+=ch;
            else str=new StringBuilder(str).reverse().toString();
        }
        return str;
    }
}
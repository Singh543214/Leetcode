class Solution {
    public int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            int ch=(s.charAt(i)-'a')+1;
            str+=ch;
        }
        int sum=0;
        for(int i=0;i<k;i++){
            System.out.println(str);
            sum=0;
            for(int j=0;j<str.length();j++){
            
                int ch=str.charAt(j)-'0';
                System.out.print(ch+" ");
                sum+=ch;
            }
            System.out.println();
            str=String.valueOf(sum);
        }
        System.out.println(str);
        return sum;
    }
}
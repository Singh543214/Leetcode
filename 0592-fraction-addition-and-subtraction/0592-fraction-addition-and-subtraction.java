class Solution {
    static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
   
    public String fractionAddition(String exp) {
       int num=0,i=0;
       int demo=1;
       int n=exp.length();
       while(i<n){
        boolean neg=false;
        int currn=0,currd=0;
        if(exp.charAt(i)=='-') neg=true;
        if(exp.charAt(i)=='-' || exp.charAt(i)=='+') i++;
        while(i<n && Character.isDigit(exp.charAt(i))){
            int digit=exp.charAt(i)-'0';
            currn=(currn*10)+digit;
            i++;
        }
        i++;
        while(i<n && Character.isDigit(exp.charAt(i))){
            int digit=exp.charAt(i)-'0';
            currd=(currd*10)+digit;
            i++;
        }
        currn=(neg)?-currn:currn;
        num=(num*currd)+(demo*currn);
        demo=currd*demo;
       }
       int hc=Math.abs(hcf(num,demo));
       return (num/hc)+"/"+(demo/hc);
    }
}
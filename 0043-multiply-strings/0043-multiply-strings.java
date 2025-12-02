class Solution {
    static String add(String a,String b){
        String sum="";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int d1=0,d2=0;
            d1=(i>=0)?(a.charAt(i)-'0'):0;
            d2=(j>=0)?(b.charAt(j)-'0'):0;
            int su=(d1+d2+carry)%10;
            sum=su+sum;
            carry=(d1+d2+carry)/10;
            i--;
            j--;
        }
        return sum;
    }


    public String multiply(String num1, String num2) {
       String finall="";
       int k=0;
        for(int i=num1.length()-1;i>=0;i--,k++){
            int d1=num1.charAt(i)-'0';
            String s="";
            int carry=0;
            for(int j=num2.length()-1;j>=0;j--){
                int d2=num2.charAt(j)-'0';
                s=(((d1*d2)+carry)%10)+s;
                carry=(((num1.charAt(i)-'0')*(num2.charAt(j)-'0')+carry)/10);
            }
            if(carry>0) s=carry+s;
            for(int l=0;l<k;l++){
                s+="0";
            }
           // System.out.println(s);
            finall=add(finall,s);
            
        }
         while (finall.length() > 1 && finall.charAt(0) == '0') {
            finall = finall.substring(1);
        }
        return finall;
    }
}
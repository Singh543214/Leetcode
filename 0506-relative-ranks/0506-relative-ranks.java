class Solution {
    static void generate(HashMap<Integer,String> map,int[] arr){
        Arrays.sort(arr);
        int x=arr.length-1;
        map.put(arr[x--],"Gold Medal");
        if(x>-1) map.put(arr[x--],"Silver Medal");
        if(x>-1) map.put(arr[x],"Bronze Medal");
        x=4;
        for(int i=arr.length-4;i>=0;i--){
           map.put(arr[i],String.valueOf(x++)); 
        }
    }
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map=new HashMap<>();
        int[] arrr=Arrays.copyOf(score,score.length);
        generate(map,score);
        String[] s=new String[score.length];
        for(int i=0;i<score.length;i++){
            s[i]=map.get(arrr[i]);
        }
        return s;
    }
}
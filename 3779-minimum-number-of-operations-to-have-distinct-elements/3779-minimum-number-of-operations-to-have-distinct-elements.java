class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               map.get(nums[i]).add(i);
            }else{
                List<Integer> li=new ArrayList<>();
                li.add(i);
                map.put(nums[i],li);
            }
        }
        boolean[] arr=new boolean[(nums.length/3)+2];
       for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
           List<Integer> li=entry.getValue();
            Collections.sort(li, Collections.reverseOrder());
           if(li.size()>1){
               int idx=li.get(1);
               int remainder=((idx+1)%3!=0)?(3-((idx+1)%3)):0;
               int res=(idx>0)?((idx+1)+remainder)/3:1;
               arr[res]=true;
           }
       }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==true) return i;
        }

        return 0;
    }
}
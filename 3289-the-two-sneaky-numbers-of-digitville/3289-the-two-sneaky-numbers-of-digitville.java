class Solution {
    static void Add_frequency(int[] nums,HashMap<Integer,Integer> map){
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
    }
    public int[] getSneakyNumbers(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     Add_frequency(nums,map);
     int[] arr=new int[2];
     System.out.print(map);
     int j=0;
    for(Integer x:map.keySet()){
        if(map.get(x)==2) arr[j++]=x;
    }
     return arr;
    }
}
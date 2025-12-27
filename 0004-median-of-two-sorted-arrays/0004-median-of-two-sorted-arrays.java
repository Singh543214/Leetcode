class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=-1;
        boolean odd=true;
        int total=(nums1.length+nums2.length);
        if(total%2==0){
            odd=false;
            total=total/2;
        }else total=total/2;
        System.out.println(total);
        int x=0,y=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                count++;
                if(count==total-1) x=nums1[i];
                if(count==total) y=nums1[i];
                i++;
            }
            else{
                count++;
                if(count==total-1) x=nums2[j];
                if(count==total) y=nums2[j];
                j++;
            }
        }
        while(i<nums1.length){
            count++;
                if(count==total-1) x=nums1[i];
                if(count==total) y=nums1[i];
                i++;
        }
        while(j<nums2.length){
                count++;
                if(count==total-1) x=nums2[j];
                if(count==total) y=nums2[j];
                j++;
        }

        return (odd)?(double)y:(double)(x+y)/(double)2;

    }
}
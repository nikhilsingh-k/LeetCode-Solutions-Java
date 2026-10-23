class Solution {
    public int findMiddleIndex(int[] nums) {
        int s =0;
        for(int n : nums){
            s += n;
        }
        int l=0, r=s;
        for(int i =0; i<nums.length;i++){
            r -= nums[i];
            if(l==r){
                return i;
            }
            l += nums[i];
        } 
        return -1;
    }
}
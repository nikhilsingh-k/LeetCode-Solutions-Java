class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0,k=nums.length-1; j<i || k>i; j++,k--){
                if(j<i){
                    l = l+nums[j];
                }
                if(k>i){
                    r = r+nums[k];
                }
            }
            if(l==r){
                return i;
            }
            else{
                l=0;
                r=0;
            }
            if(i==nums.length-1){
                return -1;
            }
        }
        return -1;
    }
}
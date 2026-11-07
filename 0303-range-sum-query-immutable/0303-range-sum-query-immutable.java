class NumArray {
    int a[];
    public NumArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        a = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return a[right];
        }
        return a[right] - a[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
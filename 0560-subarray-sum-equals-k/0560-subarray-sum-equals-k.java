class Solution {
    public int subarraySum(int[] nums, int k) {
        int a[] = new int[nums.length + 1];
        a[0]=0;

        for(int i=1; i<=nums.length; i++){
            a[i] = a[i-1]+ nums[i-1];
        }

        int c=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j]-a[i] == k){
                    c++;
                }
            }
        }
        return c;
    }
}
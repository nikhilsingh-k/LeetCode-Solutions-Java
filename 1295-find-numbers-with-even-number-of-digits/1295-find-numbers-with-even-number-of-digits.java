class Solution {
    public int findNumbers(int[] nums) {
        int c=0,k=0,n;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            while(n>0){
                c++;
                n=n/10;
            }
            if(c%2==0){
                k++;
            }
            c=0;
        }
        return k;
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=1;
        int y=n;
        int a[] = new int[2*n];
        a[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(i%2==0){
                a[i]=nums[x];
                x++;
            }
            else{
                a[i]=nums[y];
                y++;
            }
        }
        return a;
    }
}
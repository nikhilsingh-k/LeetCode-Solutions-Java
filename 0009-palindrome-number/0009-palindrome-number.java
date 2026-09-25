class Solution {
    public boolean isPalindrome(int x) {
        int n=x,d,r=0;
        while(n>0){
            d = n%10;
            r = r*10+d;
            n = n/10;
        }
        if(r==x){
            return true;
        }
        else{
            return false;
        }
    }
}
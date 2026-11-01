class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        char c;
        for(int i=0; i<j; i++){
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            j--;
        }
    }
}
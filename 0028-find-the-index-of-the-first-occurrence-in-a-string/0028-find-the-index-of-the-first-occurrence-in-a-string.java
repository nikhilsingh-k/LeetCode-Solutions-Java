class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i<=haystack.length() - needle.length(); i++){
            int c=0;
            while(c<needle.length() && haystack.charAt(i + c) == needle.charAt(c)){
                c++;
            }
            if(c==needle.length()){
                return i;
            }
        }
        return -1;
    }
}
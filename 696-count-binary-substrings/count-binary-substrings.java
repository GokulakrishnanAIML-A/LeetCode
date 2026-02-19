class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        int count=0;
        int p1=1;
        int p2=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                p1++;
            }
            else{
                p2=p1;
                p1=1;
            }
            if(p1<=p2){
                count++;
            }
        }
        return count;

    }
}
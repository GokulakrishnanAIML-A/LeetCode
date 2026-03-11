class Solution {
    public int bitwiseComplement(int n) {
        int sum=0;
        int i=0;
        int m=-1;
        if(n==0){
                return 1;
        }
        while(n>0){
            
            if((n&1)==0){
                m=1;
            }
            else{
                m=0;
            }
            sum+=(m)*Math.pow(2,i);
            i+=1;
            n=n>>1;
        }
        return sum;
    }
}
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=sum(1,n);
        int evensum=sum(2,n);
        System.out.println(oddsum);
        System.out.println(evensum);
        int gcd=1;
        int minim=Math.min(oddsum,evensum);
        for(int i=2;i<=Math.sqrt(minim);i++){
            if(oddsum%i==0 && evensum %i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    int sum(int a,int m){
        int ans =(m*(2*a+(m-1)*2))/2;
        return ans;
    }
}
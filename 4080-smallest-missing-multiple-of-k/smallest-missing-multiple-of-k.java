class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<=n;i++){
            while(j<=n){
                if(j==n){
                    return k*i;
                }
                else if(nums[j]==k*i){
                    break;
                }
                else{
                    j++;
                }
            }
        }
        return k*(n+1);
    }
}
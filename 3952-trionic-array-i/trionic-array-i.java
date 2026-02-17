class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length-1;
        int p=0;
        int q=n;
        while(p<n){
            if(nums[p]<nums[p+1]){
                p+=1;
            }
            else{
                break;
            }
        }
        while(q>0){
            if(nums[q]>nums[q-1]){
                q-=1;
            }
            else{
                break;
            }
        }
        if(p<q && p>0 && q<n ){
            for (int i=p;i <q;i++){
                if(nums[i]<=nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
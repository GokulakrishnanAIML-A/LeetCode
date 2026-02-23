class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++){
            set.add(s.substring(i,i+k));
        }
        System.out.println(set);
        if(set.size() == Math.pow(2,k)){
            return true;
        }
        else{
            return false;
        }
    }
}
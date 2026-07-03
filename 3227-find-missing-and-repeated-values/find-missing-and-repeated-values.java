class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum=0;
        int dup=0;
        int n=grid.length;
        int m= n*n;
        HashSet<Integer> s= new HashSet<>();
        for(int i=0 ;i<n;i++){
            for(int j=0 ;j<n;j++){
                if(! s.contains(grid[i][j])){
                    s.add(grid[i][j]);
                    sum+=grid[i][j];
                }
                else{
                    dup=grid[i][j];
                }
            }
        }
        return new int[]{dup,(m*(m+1)/2)-sum};
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        if (n == 0 || n==1)
            return n;
        int ans = 1;
        for(int i=1; i<n; i++) {
            if(nums[i] == nums[i-1]) 
                continue;
            else if((nums[i] - nums[i-1]) == 1) 
                ans+=1;
            else {
                res = Math.max(res, ans);
                ans  = 1;
            }
        }
        res = Math.max(res, ans);
       
        return res;
    }
}
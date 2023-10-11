class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentMax = nums[0];
        int globalMax = currentMax;
        
        if (n == 1) return currentMax;
        for (int i = 1; i < n; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            globalMax = Math.max(currentMax, globalMax);
        }
        
        return globalMax;
    }
}

    
    
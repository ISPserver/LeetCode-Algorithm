class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsHash = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsHash.add(nums[i]);
            if (numsHash.size() != i + 1) return true;
        }
        
        return false;
    }
}
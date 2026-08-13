class Solution {
    public int[] twoSum(int[] nums, int target) {
        // edge case
        if (nums.length < 2) {
            return new int[]{};
        }
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (counts.containsKey(complement)) {
                // complement index and current index if difference is valid
                return new int[]{counts.get(complement), i};
            }
            // else put regular value into hashmap
            counts.put(nums[i], i);
        }
        // empty array if no solution
        return new int[]{};
    }
}

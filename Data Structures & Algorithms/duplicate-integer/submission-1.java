class Solution {
    public boolean hasDuplicate(int[] nums) {
        // edge case - empty array or 1 element impossible to have a duplicate
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> counts = new HashSet<>();
        // input array loop and add into hashset after created
        for (int num : nums) {
            // checks duplicates with contains keyword for hashse
            if (counts.contains(num)) {
                return true;
            }
            counts.add(num);
        }
        return false;
    }
}

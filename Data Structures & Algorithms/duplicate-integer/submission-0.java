class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for (int num : nums) {
            if (arr.contains(num)) {
                return true;
            }
            arr.add(num);
        }
        return false;
    }
}


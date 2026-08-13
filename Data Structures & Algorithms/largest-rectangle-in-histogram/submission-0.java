class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {
            int h = heights[i];
            int start = i;

            while (!stack.isEmpty() && stack.peek()[1] > h) {
                int[] popped = stack.pop();
                int index = popped[0];
                int height = popped[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            stack.push(new int[]{start, h});
        }
        for (int[] pairs : stack) {
            int index = pairs[0];
            int height = pairs[1];
            maxArea = Math.max(maxArea, height * (heights.length -         index));
        }
        return maxArea;
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Step 1: Create result array
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 2: Set up two pointers
        int left = 0;       // Start position
        int right = n - 1;  // End position
        
        // Step 3: Fill result array from back
        int idx = n - 1;    // Start from end
        
        while(left <= right) {
            // Compare absolute values and place larger square
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[idx] = nums[left] * nums[left];
                left++;
            } else {
                result[idx] = nums[right] * nums[right];
                right--;
            }
            idx--;
        }
        
        return result;
    }
}
class Solution {
    public String removeKdigits(String num, int k) {
        // Use StringBuilder as a stack
        StringBuilder stack = new StringBuilder();
        
        for (char c : num.toCharArray()) {
            // Remove larger digits if possible
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }
        
        // If still need to remove digits, remove from end
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        
        // Remove leading zeros
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }
        
        String result = stack.substring(i);
        return result.isEmpty() ? "0" : result;
    }
}

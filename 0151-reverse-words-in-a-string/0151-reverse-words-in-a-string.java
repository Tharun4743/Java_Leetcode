class Solution {
    public String reverseWords(String s) {
        // Trim the string and split by spaces using regex to handle multiple spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Traverse from end to start
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}

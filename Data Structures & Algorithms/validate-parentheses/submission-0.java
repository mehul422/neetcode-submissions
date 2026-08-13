class Solution {
    public boolean isValid(String s) {
        // base case for odd string bc valid parentheses come in pairs
        if (s.length() % 2 != 0) {
            return false;
        }
        // hash mapping of parentheses
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')','(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');
        // stack creation and main algorithm of popping if matches
        Stack<Character> validP = new Stack<>();
        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)) {
                // ternary to check stack being empty else pop
                char topElement = validP.isEmpty() ? '#' : validP.pop();
                if (topElement != parentheses.get(c)) {
                    return false;
                }
            } else {
                validP.push(c);
            }
        }
        // true if all is well at the end
        return validP.isEmpty();
    }
}
class Solution {
    public boolean isValid(String s) {
        // Time O(n) and Space O(n) worst case
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') { // opening parentheses gets added
                stack.add(ch);
            } else if (!stack.isEmpty() && ch == ')' && stack.peek() == '('
                || !stack.isEmpty() && ch == '}' && stack.peek() == '{'
                || !stack.isEmpty() && ch == ']' && stack.peek() == '[') { // stack being empty means there's no opening parentheses
                stack.pop();
            } else {
                return false; // stack is empty and there is a closing parentheses
            }
        }
        return stack.isEmpty(); // could have a trailing open parentheses
    }
}


class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // 👉 If not closing bracket → just push
            if (c != ']') {
                stack.push(String.valueOf(c));
            } 
            
            // 👉 If closing bracket → resolve
            else {

                // 1. Build substring
                StringBuilder substr = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    substr.insert(0, stack.pop());
                }

                // remove '['
                stack.pop();

                // 2. Build number (could be multi-digit)
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0, stack.pop());
                }

                int count = Integer.parseInt(num.toString());

                // 3. Repeat substring
                String repeated = substr.toString().repeat(count);

                // 4. Push back result
                stack.push(repeated);
            }
        }

        // 👉 Build final result
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
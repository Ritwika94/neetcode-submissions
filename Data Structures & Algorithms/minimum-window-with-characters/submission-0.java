class Solution {
    public String minWindow(String s, String t) {

         Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
    target.put(c, target.getOrDefault(c, 0) + 1);
}

        int left =0;
        int length =0;
        int minLen = Integer.MAX_VALUE;
        int start =0;
        int formed =0;
        Map<Character, Integer> window = new HashMap<>();


        for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    window.put(c, window.getOrDefault(c, 0) + 1);

    if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
        formed++;
    }

    // Shrink the window while it is valid
    while (formed == target.size()) {
        if (right - left + 1 < minLen) {
            minLen = right - left + 1;
            start = left;
        }

        char leftChar = s.charAt(left);
        window.put(leftChar, window.get(leftChar) - 1);

        if (target.containsKey(leftChar) && window.get(leftChar) < target.get(leftChar)) {
            formed--;
        }
        left++;
    }
}
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
 
        
    }
}

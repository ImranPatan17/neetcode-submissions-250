class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            while (res.contains(s.charAt(i) + "")) {
                res = res.substring(1);
            }

            res += s.charAt(i);
            max = Math.max(max, res.length());
        }

        return max;
    }
}

class Solution {
    static String reverse(String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i)+"";
        }
        return res;
    } 
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
        
       StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());

    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res="";int max =0;
        int i =0;
        while(i<s.length()){

            while(res.contains(s.charAt(i)+"")) {


                res = res.substring(1);
            }
                res += s.charAt(i);
                System.out.println("res= "+res);

            i++;
           max = Math.max(res.length(),max);
            System.out.println("max = "+max );
        }
        return max;
    }
}

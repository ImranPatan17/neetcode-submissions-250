
class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> hs= new HashSet<>(); 
       for(int n:nums)
       {
        if(!hs.contains(n))
        hs.add(n);
       }
       return nums.length!= hs.size();
    }
}
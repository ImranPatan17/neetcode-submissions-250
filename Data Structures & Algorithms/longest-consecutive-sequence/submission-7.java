class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
            return 0;
        int count = 1;
        int max = 0;
        int i = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        while (i < nums.length - 1) {
            if ((nums[i + 1] - nums[i]) == 1)
                count++;
            else if (( nums[i+1] - nums[i])>1)
            {
                ar.add(count);
                count=1;
            }
            i++;
        }
      ar.sort((a,b)->a-b);
      if(ar.isEmpty())
      max =0;
      else 
      {
        max = ar.get(ar.size()-1);
      }
       
        if (max < count)
            max = count;
        return max;
    }
}

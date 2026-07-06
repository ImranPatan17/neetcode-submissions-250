class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int k=0,j=0;
        for (int i = 0; i < nums.length-2; i++) {
           j=i+1;
           while(j<nums.length-1){
             k=j+1;
            while (k < nums.length) {
               
                if (nums[i] ==-( nums[j] + nums[k])) {
                    list = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.sort((a, b) -> a - b);
                    set.add(list);
                }
                k++;
            }
            j++;
           }
        }
        return set.stream().toList();
    }
}

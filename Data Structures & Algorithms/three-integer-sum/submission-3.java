class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>(); 
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        list = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.sort((a,b)->a-b);
                        set.add(list);
                    }
                }
            }
        }
        return set.stream().toList();
    }
}

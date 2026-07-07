class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int k=0,j=0,l=0;
        long sum =0;
        for (int i = 0; i < nums.length-2; i++) {
           j=i+1;
           while(j<nums.length-1){
             k=j+1;
            while (k < nums.length-1) {
                l=k+1;
               while(l<nums.length){
                sum =(long)nums[i]+ nums[j] + nums[k]+ nums[l];
               
                if (sum == target) {
                    list = Arrays.asList(nums[i], nums[j], nums[k],nums[l]);
                    list.sort((a, b) -> a - b);
                    set.add(list);
                }
                l++;
               }
                k++;
            }
            j++;
           }
        }
        return set.stream().toList();
    }
}
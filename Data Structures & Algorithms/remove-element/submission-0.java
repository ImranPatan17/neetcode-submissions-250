class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ar.add(nums[i]);
            }
        }
        int value = nums.length-ar.size();
        for(int i=0;i<ar.size();i++){
            nums[i]=ar.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return ar.size();
    }
}

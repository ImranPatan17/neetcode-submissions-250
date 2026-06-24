class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>size){
                    list.add(entry.getKey());
            }
        }
        return list;
    }
}
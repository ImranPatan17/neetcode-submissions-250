class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int key=0,value=0;
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(value < entry.getValue()){
                value = entry.getValue();
                key = entry.getKey();
            }
     }
     return key;
    }
}
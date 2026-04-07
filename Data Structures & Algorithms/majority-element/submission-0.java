class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxval=-1;
        int maxKey=Integer.MIN_VALUE;
       for(Map.Entry<Integer,Integer>entry: map.entrySet()){
           if(entry.getValue()>maxval)
           {
            maxval=entry.getValue();
            maxKey=entry.getKey();
           } 
       }
       return maxKey;
    }
}
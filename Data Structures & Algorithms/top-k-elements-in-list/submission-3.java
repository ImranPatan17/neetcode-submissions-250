class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map= new HashMap<>();
       ArrayList<Integer> ar= new ArrayList<>();
       ArrayList<Integer> al= new ArrayList<>();
       for(int i=0;i<nums.length;i++){
         Integer e=nums[i];
        map.put(e,map.getOrDefault(e,0)+1);
       }
         List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        // 3. Take top k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}

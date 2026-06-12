class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       int val =1;
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<> (map.entrySet());
           list.sort((a,b)->b.getValue()- a.getValue());
           int [] arr = new int [k];
           for(int i =0;i<k;i++){
            arr[i]= list.get(i).getKey();
           }
       return arr;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<m;i++){
           
            
            ar.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            ar.add(nums2[i]);
        }
        ar.sort((a,b)->a-b);

        for(int i=0;i<ar.size();i++){
           nums1[i]= ar.get(i);
        }
    }
}
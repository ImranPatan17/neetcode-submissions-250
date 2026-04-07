class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] b=new int[nums.length*2];
  
        for(int i=0;i<b.length;i++){
           
            if(i>=nums.length)
            b[i]= nums[i- nums.length ];
            else 
             b[i]=nums[i];
        }
        return b;
    }
}
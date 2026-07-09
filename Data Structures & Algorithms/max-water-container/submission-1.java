class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int i=0,j=heights.length-1;
        while(i<j){
            if(max<(j-i)* Math.min(heights[i],heights[j]))
               max= (j-i)* Math.min(heights[i],heights[j]);

               if(heights[i]<heights[j])
                i++;
                else j--;
        }
        return max;
    }
}

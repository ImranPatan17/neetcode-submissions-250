class Solution {
    public int trap(int[] height) {
          if (height == null || height.length == 0) {
            return 0;
        }
        int sum =0;
            int i=0;int j=height.length-1;
            int leftMax=height[i];int rightMax=height[j];
                    while (i<j) {
                        if(leftMax <rightMax){
                            i++;
                            leftMax = Math.max(leftMax,height[i]);
                            sum+=leftMax-height[i];
                        }
                        else{
                            j--;
                            rightMax = Math.max(rightMax,height[j]);
                            sum+=rightMax-height[j];
                        }
                     
                    }
        return sum;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
       int i=0,j=i+1,profit =0,max=0;
      while(j<prices.length){
            if((prices[j]-prices[i])>0){
            profit= prices[j]-prices[i];
                max=Math.max(max,profit);
            }
            else
            i=j;
            j++;
  
       }
        return max;
    }
}

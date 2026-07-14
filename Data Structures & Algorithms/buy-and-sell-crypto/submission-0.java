class Solution {
    public int maxProfit(int[] prices) {
       int sum =0,max=0;
       for(int i=0;i<prices.length;i++){
        for(int j=i+1;j<prices.length;j++){
            if((prices[j]-prices[i])>sum)
            sum= prices[j]-prices[i];
        }
       }
        return sum;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;int i=0;
        while(i<prices.length-1){
            if((prices[i+1]-prices[i])>0)
            sum+=prices[i+1]-prices[i];
            i++;
        }
        return sum;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // 최소 가격
        int maxProfit = 0; // 최대 이익
        
        for (int price : prices) {
            // 현재 가격이 최소 가격보다 작으면 최소 가격을 업데이트
            if (price < minPrice) {
                minPrice = price;
            } 
            // 현재 가격에서 최소 가격을 뺀 값이 최대 이익보다 크면 최대 이익을 업데이트
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}
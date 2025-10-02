class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink=0;
        int empty=0;
        while(numBottles>0){
            drink+=numBottles;
            empty+=numBottles;
            numBottles=0;
            while(empty>=numExchange){
                empty-=numExchange;
                numBottles++;
                numExchange++;
            }
             System.out.println(drink+" "+empty);
        }
        return drink;
    }
}
class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum=0;
        double wait_time=0;
        for(int i=0;i<customers.length;i++){
            if(sum>=customers[i][0]) {
                sum+=customers[i][1];
            }
            else sum=customers[i][0]+customers[i][1];
            wait_time+=sum-customers[i][0];
        }
        return wait_time/customers.length;
    }
}
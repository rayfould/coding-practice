class Solution {
    public int singleNumber(int[] nums) 
    {
        int runningCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
           runningCount = runningCount ^ nums[i];
        }
        return runningCount;

    }
}
class Solution {
    public int missingNumber(int[] nums) 
    {
        int xorNums = 0;
        int xorOriginal = 0;
        for(int num : nums)
        {
            xorNums ^= num;
        }

        for(int i = 0; i < nums.length + 1; i++)
        {
            xorOriginal ^= i;
        }

        return xorOriginal ^ xorNums;
    }
}
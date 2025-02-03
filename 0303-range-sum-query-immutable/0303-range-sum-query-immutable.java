class NumArray 
{
    int output;
    int[] temp;

    public NumArray(int[] nums) 
    {
        temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if (i == 0)
            {
                temp[i] = nums[i];
                continue;
            }
            temp[i] = temp[i-1] + nums[i];
        }
        System.out.println(temp);
    }
    
    public int sumRange(int left, int right) 
    {
        if(left == 0)
        {
            return temp[right];
        }
        return temp[right] - temp[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
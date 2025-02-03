class NumArray 
{
    int output;
    int[] temp;

    public NumArray(int[] nums) 
    {
        temp = nums;
    }
    
    public int sumRange(int left, int right) 
    {
        output = 0;
        for(int i = left; i <= right; i++)
        {
            output+= temp[i];
        }    
        return output;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
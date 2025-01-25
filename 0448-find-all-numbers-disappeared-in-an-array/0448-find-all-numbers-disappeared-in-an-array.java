class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int size = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i < size; i++)
        {
            seen.add(nums[i]);
        }

        for(int i = 1; i <= size; i ++)
        {
            if(!seen.contains(i))
            {
                output.add(i);
            }
        }
        return output;

    }
}
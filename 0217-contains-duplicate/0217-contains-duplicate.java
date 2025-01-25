class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> mySet = new HashSet<>();
        for (int item : nums)
        {
            mySet.add(item);
        }
        if(mySet.size() != nums.length)
            {
                return true;
            }
        return false;
    }
}
class Solution {
    public boolean isPalindrome(int x) 
    {
        if (x < 0)
        {
            return false;
        }
        String number = Integer.toString(x);
        char[] value = number.toCharArray();
        int start = 0;
        int end = value.length - 1;
        while(start < end)
        {
            if (value[start] != value[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;


    }
}
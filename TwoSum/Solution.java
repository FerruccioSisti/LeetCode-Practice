class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] sums = new int[2];

        //Need to loop through each element of the array until we find the sums
        for (int i = 0; i < nums.length; i++)
        {
                for (int j = 0; j < nums.length; j++)
                {
                    //Check if they are the correct sums
                    if ( (nums[i] + nums[j]) == target && i != j)
                    {
                        //store the indices in an array to return them
                        sums[0] = i;
                        sums[1] = j;

                        return sums;
                    }

                }            
        }
        return sums;
    }
}

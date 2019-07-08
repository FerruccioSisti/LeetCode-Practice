class Solution {
    public int heightChecker(int[] heights) {

        int counter = 0;

        //Clone the array so we can sort one of them for comparison
        int[] temp = heights.clone();
        Arrays.sort(temp);

        //compare the two arrays
        for (int i = 0; i < heights.length; i++)
        {
            //if the indice is different then its out of order, increment the counter
            if (temp[i] != heights[i])
            {
                counter++;
            }
        }

        return counter;
    }
}

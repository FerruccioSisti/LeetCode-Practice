class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewelCount = 0;
        String temp;

        //Loop through string of stones to check which are jewels
        for (int i = 0; i < S.length(); i++)
        {
            //If stone is in string J then it is a jewel
            if (J.contains(Character.toString(S.charAt(i))))
            {
                jewelCount++;
            }
        }
        
        return jewelCount;
    }
}

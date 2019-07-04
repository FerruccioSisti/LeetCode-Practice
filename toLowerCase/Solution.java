class Solution {
    public String toLowerCase(String str) {

        //Temp string to store new characters
        String temp, result = "";

        //Iterate through entire string
        for (int i = 0; i < str.length(); i++)
        {
            int character = str.charAt(i);
            //check if the character is uppercase
            if (character >= 65 && character <= 90)
            {
                //change the uppercase to lowercase
                character += 32;
            }

            //Change int to string using its ascii value
            temp = Character.toString((char) character);
            //Concat new updated character onto result string
            result += temp;
        }

        return result;
    }
}

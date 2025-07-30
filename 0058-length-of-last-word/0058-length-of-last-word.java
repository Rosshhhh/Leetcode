class Solution {
    public int lengthOfLastWord(String s) 
    {
        int s1 = s.length()-1;
        int length = 0;

        while(s1>=0 && s.charAt(s1) == ' ')
        {
            s1--;
        }

        while(s1>=0)
        {
            if(s.charAt(s1)== ' ')
            {
                break;
            }
            length++;
            s1--;
        }
        return length;    
    }
}
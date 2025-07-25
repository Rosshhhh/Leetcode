class Solution {
    public int reverse(int x) 
    {
        
        int rev = 0;

        while(x!=0)
        {
            int rem = x % 10;

            if((rev > Integer.MAX_VALUE / 10) || (rev == Integer.MAX_VALUE && rem > 6))
            {
                return 0;
            }
            if((rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE && rem < -8))
            {
                return 0;
            }

            rev = (rev * 10) + rem;
            x = x/10;
        }
        if(rev > Integer.MAX_VALUE ) return 0;
        return rev;
    }
}
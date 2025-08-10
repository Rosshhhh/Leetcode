class Solution {
    public int maxArea(int[] height) 
    {
        int max = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right)
        {
            int width = right - left;
            int minheight = 0;

            if(height[left] < height[right])
            {
                minheight = height[left];
            }
            else
            {
                minheight = height[right];
            }

            int area = width * minheight;

            if(max<area)
            {
                max = area;
            }
            
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}
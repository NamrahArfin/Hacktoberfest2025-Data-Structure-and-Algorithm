class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int left=0,ans=-1,window=0;
        int n=nums.length;

        for(int right=0;right<n;right++)
        {
            window+=nums[right];
            while(right-left+1!=window)
            {
                window-=nums[left];
                left++;
            }

            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}

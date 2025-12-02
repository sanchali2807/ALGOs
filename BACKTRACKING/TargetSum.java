class Solution {
        int count = 0;
    public void fun(int [] nums , int target ,int n,int sum,int idx){
       if (idx == n) {
    if (sum == target) count++;
    return;      
}
        fun(nums,target,n,sum+nums[idx],idx+1);
        fun(nums,target,n,sum-nums[idx],idx+1);

    }
    public int findTargetSumWays(int[] nums, int target) {
        fun(nums,target,nums.length,0,0);
        return count;
    }
}

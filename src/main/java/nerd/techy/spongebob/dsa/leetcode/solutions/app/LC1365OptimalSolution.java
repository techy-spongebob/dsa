class LC1365OptimalSolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {  
        if(nums == null || nums.length == 0) {
            return nums;
        }
        
        int[] count = new int[101];
        int[] sum = new int[101];
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length;i++) {
            count[nums[i]]++;
        }
        
        for(int i=1; i<101; i++) {
            sum[i] = count[i-1] + sum[i-1];
        }
        
        for(int i=0; i<nums.length; i++) {
            result[i] = sum[nums[i]];
        }
        
        return result;
    }
}
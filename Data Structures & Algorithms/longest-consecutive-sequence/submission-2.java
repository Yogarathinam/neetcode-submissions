class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int current = 1;
        int max = 1;

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i + 1] == nums[i]){
                continue;
            }

            if(nums[i + 1] - nums[i] == 1){
                current++;
            }else{
                max = Math.max(max, current);
                current = 1;
            }
        }

        max = Math.max(max, current);

        return max;
    }
}
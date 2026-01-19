class Solution {
    public void moveZeroes(int[] nums) {
        int read = 0;
        int spot = 0;
        while(read < nums.length){
            if(nums[read] != 0){
                int temp = nums[spot];
                nums[spot] = nums[read];
                nums[read] = temp;
                spot++;
            }
            read++;
        }
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int result = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 1 ){
                cons++;
            }

            if(nums[i] != 1 || i == nums.length - 1){
                if(cons > result){
                    result = cons;
                }
                cons = 0;
            }

        }

        return result;
        
    }
}
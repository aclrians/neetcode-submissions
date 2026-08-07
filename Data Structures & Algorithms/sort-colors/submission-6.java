class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];


        for(int i = 0; i < nums.length; i++){
            if(count.length == 1){
                count[0] = nums[0];
                return;
            }
            // red
            if(nums[i] == 0 ){
                count[0] = count[0] + 1;
            }
            // white
            else if(nums[i] == 1){
                count[1] = count[1] + 1;
            }
            // blue
            else if(nums[i] == 2){
                count[2] = count[2] + 1;
            }
        }

        int k = 0;


        for(int i = 0; i < count.length;i++){
            if(count.length == 1){
                break;
            }
            for(int j = 0; j < count[i];j++){
                nums[k++] = i;
                
            }
        }


        
    }
}
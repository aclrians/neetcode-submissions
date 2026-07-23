class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int currentProd = 1;
        
        for(int i = 0; i < nums.length ; i++){            
            // Our i is the index that we need to skip over
            for(int j = 0; j < nums.length;j++){
                if(j == i){
                    continue;
                }
                else{
                    currentProd *= nums[j];
                }
            }

            result[i] = currentProd;
            currentProd = 1;
        }

        return result;
    }
} 

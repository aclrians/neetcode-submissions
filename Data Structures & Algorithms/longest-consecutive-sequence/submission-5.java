class Solution {
    public int longestConsecutive(int[] nums) {
       
       Set<Integer> set = new HashSet<>();
       
       for (Integer num:nums){
        set.add(num);
       }
        // Return this value
       int longest = 0;

       for(int num:set){
        if(!set.contains(num-1)){
            int length = 0;
            
            while(set.contains(num+length)){
                length++;
            }
            
            longest = Math.max(longest,length);

        }
       }

       return longest;

     
    }
}

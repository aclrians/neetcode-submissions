class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        String clean = string.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = clean.toCharArray();

        int l = 0;
        int r = arr.length-1;


        while(l < r){
            if(arr[l] == arr[r]){
                System.out.print(arr[l] + " " + arr[r]);
                l++;
                r--;
            }
            else{
                return false;
            }
        }

        return true;


        
    }
}

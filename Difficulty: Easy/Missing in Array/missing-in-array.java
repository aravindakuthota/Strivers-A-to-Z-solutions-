class Solution {
    int missingNum(int arr[]) {
        // code here
        
         int xor = 0;
        int n = arr.length+1;

        for (int i = 0; i < arr.length; i++) {
           xor =  xor ^ arr[i];
        }
        
        for(int i =1; i<=n;i++){
           xor = xor ^ i;
        };

      
        return xor;
    }
}
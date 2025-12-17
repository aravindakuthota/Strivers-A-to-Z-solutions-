// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int [] arr = new int[n];
        
        if(n == 1) {
            arr[0] = 0;
            return arr;
        }
        
       arr[0] = 0;
       arr[1] = 1;
       
       for(int i =2; i<n;i++){
           arr[i] = arr[i-1] + arr[i -2];
       }
        
        return arr;
    }
}
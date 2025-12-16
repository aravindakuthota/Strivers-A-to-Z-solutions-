class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
                
               
            
        }
         return largest;
        
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
 
     boolean found = false;

    for( int[] row : matrix)
    if(BinarySearch(row, target)) {
        found = true;
            break;
         }
         return found;
    }


public boolean BinarySearch(int[] arr, int target) {
 int low = 0;
 int high = arr.length-1;

 while(low <= high ){
    int mid = low + ( high - low ) / 2;

  if(arr[mid] == target){
     return true;
  }
  if(arr[mid] > target)  high = mid -1;
   
   else low = mid + 1;
  

 }
  return false;

}

}

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
       ArrayList<Integer> result = new ArrayList<>();
       
       HashSet<Integer> set = new HashSet<>();
       
       for(int num : arr){
           if(!set.add(num)) {
               result.add(num);
           }
       }
      
      return result ;
      
    }
}
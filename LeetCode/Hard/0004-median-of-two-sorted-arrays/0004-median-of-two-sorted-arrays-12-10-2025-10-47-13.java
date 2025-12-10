// brute force solution 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
       int i =0; int j =0;

       while(i < nums1.length && j < nums2.length) {

        if(nums1[i] < nums2[j]) 
            arr.add(nums1[i++]);
            else 
              arr.add(nums2[j++]); 
 
       }

       while(i<nums1.length)
         arr.add(nums1[i++]);

    while(j < nums2.length)
    arr.add(nums2[j++]);

    int n = arr.size();


    if(n % 2 ==1 )
        return arr.get(n/2);
    return (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;


    }
}
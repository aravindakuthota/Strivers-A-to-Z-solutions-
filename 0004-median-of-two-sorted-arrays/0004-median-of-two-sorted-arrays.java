class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int ind2 = n / 2;      // second median index
        int ind1 = ind2 - 1;   // first median index (only used when n is even)

        int i = 0, j = 0, cnt = 0;
        int ind1_el = -1, ind2_el = -1;

        // Merge like sorted arrays
        while (i < n1 && j < n2) {
            int val;

            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            if (cnt == ind1) ind1_el = val;
            if (cnt == ind2) ind2_el = val;

            cnt++;
        }

        // Remaining nums1
        while (i < n1) {
            int val = nums1[i++];

            if (cnt == ind1) ind1_el = val;
            if (cnt == ind2) ind2_el = val;

            cnt++;
        }

        // Remaining nums2
        while (j < n2) {
            int val = nums2[j++];

            if (cnt == ind1) ind1_el = val;
            if (cnt == ind2) ind2_el = val;

            cnt++;
        }

        // Return median
        if (n % 2 == 1) return ind2_el;  // odd length
        return (ind1_el + ind2_el) / 2.0;
    }
}

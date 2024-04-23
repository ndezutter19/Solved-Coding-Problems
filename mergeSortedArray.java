//The problem requires merging two sorted integer 
//arrays into the first array, which is sized to fit both arrays, 
//without returning a new array, modifying the first array in-place to contain 
//the sorted elements of both arrays.

import java.util.Arrays;

class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

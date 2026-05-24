class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        for(int i = 0; i < m; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            arr[m + i] = nums2[i];
        }
        Arrays.sort(arr);
        int len = m + n;
        if(len % 2 == 0){
            int mid = len / 2;
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
        else{
            return arr[len / 2];
        }
    }
}

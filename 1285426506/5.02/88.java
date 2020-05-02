class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int i = 0, j = 0;
        for(int k = 0; k < m + n; k++){
            if(i >= m)
              nums1[k] = nums2[j++];
            else if (j >= n) 
              nums1[k] = temp[i++];
            else if(temp[i] > nums2[j])
             nums1[k] = nums2[j++];
            else 
              nums1[k] = temp[i++];
        }
    }
}
/**
 *  File Name: Solution.java
 *  Desc: xxxx 
 *  Author: cyhe 
 *  Created Time: 2016-11-27 21:30:14
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i=0; i<nums.length; i++) { 
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

// https://leetcode.com/problems/sort-colors/description/

// Sort Color
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]


import java.util.Arrays;

public class SortColors {
    public static void main(String[] args){
        int[] colors= {0,2,1,2,1,0,2,1,0,0};
        solution(colors);
        System.out.println(Arrays.toString(colors));

    }

    static void solution(int[] nums){
        int left = 0;
        int index =0;
        int right = nums.length-1;


        while(index<=right){
            if(nums[index] == 2){
                int temp = nums[index];
                nums[index] = nums[right];
                nums[right] = temp;

                right--;
            }else if (nums[index] == 0){
                int temp = nums[index];
                nums[index] = nums[left];
                nums[left] = temp;
                left++;
                index++;
            }else {
                index++;
            }
        }

    }
}

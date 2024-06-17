//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//        Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        solution2(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    static void solution(int[] nums, int k){
        k = k%nums.length;
        int[] temp = new int[k];
        int pointer = temp.length-1;
        for(int i= nums.length-1; i>=nums.length-k; i--){
            temp[pointer] = nums[i];
            pointer--;
        }

        for(int i=nums.length-1; i>=k; i--){
            nums[i] = nums[i-k];
        }


        for(int i =0; i<temp.length; i++){
            nums[i] = temp[i];
        }
    }

    static void solution2(int[] nums,int k){
        int[] temp = new int[nums.length];
        int n = nums.length;
        for(int i =0; i<nums.length; i++){
            int newIndex = (i+k)%n;
            temp[newIndex] = nums[i];
        }

        for(int i =0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}

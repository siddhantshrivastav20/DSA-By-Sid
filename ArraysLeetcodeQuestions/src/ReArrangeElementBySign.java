// https://leetcode.com/problems/rearrange-array-elements-by-sign/submissions/1290647191/



import java.util.Arrays;

public class ReArrangeElementBySign {
    public static void main(String[] args){
        int[] arr = {-1,1};
        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] solution(int[] nums){
        int[] neg = new int[nums.length/2];
        int negi = 0;
        int[] pos = new int[nums.length/2];
        int posi = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] > 0){
                pos[posi] = nums[i];
                posi++;
            }
            if(nums[i] < 0){
                neg[negi] = nums[i];
                negi++;
            }
        }

        negi--;
        posi--;

        int i =nums.length-1;
        while (i>=0){
            nums[i] = neg[negi];
            i--;
            negi--;
            nums[i] = pos[posi];
            i--;
            posi--;
        }
        return nums;
    }


    // Optimized Solution;
    static int[] solution2(int[] nums){
        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                res[pos] = nums[i];
                pos += 2;
            }
            if(nums[i]<0){
                res[neg] = nums[i];
                neg +=2;
            }
        }
        return res;
    }
}

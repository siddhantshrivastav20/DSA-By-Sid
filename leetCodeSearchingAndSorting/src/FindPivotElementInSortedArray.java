// Find Pivot element in sorted array...

// Very Important Question..

public class FindPivotElementInSortedArray {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        int ans = findPivot(arr);
        System.out.println(ans);
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(start == end){
                return start;
            }
            if(mid > 0 && nums[mid]< nums[mid-1]){
                return mid+1;
            } else if (mid+1 < nums.length-1 && nums[mid]> nums[mid+1]) {
                return mid;
            } else if (nums[start]> nums[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
